package com.innowise.currency.config;

import com.innowise.currency.entity.Pair;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDateTime.now;

@Component
public class CurrencyScopeConfig implements Scope {

    private Map<String, Pair<LocalDateTime, Object>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (map.containsKey(name)) {
            Pair<LocalDateTime, Object> pair = map.get(name);
            if (getAgeOfSecond(pair.getKey()) > 1){
                map.put(name, new Pair<>(now(), objectFactory.getObject()));
            }
        } else {
            map.put(name, new Pair<>(now(), objectFactory.getObject()));
        }
        return map.get(name).getValue();
    }

    private long getAgeOfSecond(LocalDateTime createTime) {
        Duration between = Duration.between(createTime, now());
        return between.getSeconds();
    }

    //todo
    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
