package hell.core.Cmd;

import hell.core.DataHandlerAble;
import hell.interfaces.Hero;
import hell.interfaces.Item;

import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 19:12.
 */
public class QuitCommand extends BaseCommand {

    protected QuitCommand(DataHandlerAble dataHandle) {
        super(dataHandle);
    }

    @Override
    public String execute() {
        StringBuilder sb=new StringBuilder();
        long counter=1;
        for (Hero hero : super.getDataHandle().getHeroCollection()) {

            sb.append(String.format("%d. %s: %s"
                    ,counter++,hero.getClass().getSimpleName().replace("Hero",""),hero.getName()));
            sb.append(System.lineSeparator());
            sb.append(String.format("###HitPoints: %d",hero.getHitPoints())).append(System.lineSeparator());
            sb.append(String.format("###Damage: %d",hero.getDamage())).append(System.lineSeparator());
            sb.append(String.format("###Strength: %d",hero.getStrength())).append(System.lineSeparator());
            sb.append(String.format("###Agility: %d",hero.getAgility())).append(System.lineSeparator());
            sb.append(String.format("###Intelligence: %d",hero.getIntelligence())).append(System.lineSeparator());
            if (hero.getItems().size()==0){
                sb.append("###Items: None");
            } else {
                sb.append("###Items: ");
                sb.append(hero.getItems().stream().map(Item::getName).collect(Collectors.joining(", ")));
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
