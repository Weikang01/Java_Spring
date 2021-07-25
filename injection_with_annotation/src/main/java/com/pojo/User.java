package com.pojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component // equivalents to <bean id="user" class="com.pojo.User"/>
@Scope("singleton")
public class User {
    @Value(value = "James") // equivalents to <property name="name" value="James"/>
    public String name;
}
