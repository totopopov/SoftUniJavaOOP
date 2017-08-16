package pr0304Barracks.core.factories;

import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"pr0304Barracks.models.units.";

	@Override
	public Unit createUnit(String unitType) {

		Unit unit =null;
		try {
			Class<?> unitClass =  Class.forName(UNITS_PACKAGE_NAME+unitType);
			unit= (Unit) unitClass.newInstance();
			return unit;
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
		throw new NotImplementedException();


	}
}
