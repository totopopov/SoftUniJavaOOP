package app.annotations;

import app.waste_disposal.annotations.Disposable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 0:53.
 */

@Disposable
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Burnable{
}
