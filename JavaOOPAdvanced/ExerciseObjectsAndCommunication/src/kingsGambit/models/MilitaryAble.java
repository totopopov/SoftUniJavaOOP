package kingsGambit.models;

import kingsGambit.models.BaseUnit;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 21:34.
 */
public interface MilitaryAble {
    Iterable<BaseUnit> getUnits();

    void addUnit(BaseUnit unit);

    void removeUnit(BaseUnit unit);
}
