package hell.core.Cmd;

import hell.core.DataHandlerAble;
import hell.core.annotation.InjectParams;
import hell.interfaces.Hero;
import hell.interfaces.Item;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 18:07.
 */
public class InspectCommand extends BaseCommand {
    @InjectParams
    private String[] params;

    protected InspectCommand(DataHandlerAble dataHandle) {
        super(dataHandle);
    }

    @Override
    public String execute() {
       String heroName= params[1];
        Hero heroe = super.getDataHandle().getHeroe(heroName);
        String heroClass = heroe.getClass().getSimpleName().replace("Hero", "");

        StringBuilder sb= new StringBuilder();
    sb.append(String.format("Hero: %s, Class: %s",heroName,heroClass)).append(System.lineSeparator());
    sb.append(String.format("HitPoints: %d, Damage: %d",heroe.getHitPoints(),heroe.getDamage())).append(System.lineSeparator());
    sb.append(String.format("Strength: %d",heroe.getStrength())).append(System.lineSeparator());
    sb.append(String.format("Agility: %d",heroe.getAgility())).append(System.lineSeparator());
    sb.append(String.format("Intelligence: %d",heroe.getIntelligence())).append(System.lineSeparator());
        if (heroe.getItems().size()==0){
            sb.append("Items: None").append(System.lineSeparator());
        } else {
            sb.append("Items:").append(System.lineSeparator());

            for (Item item : heroe.getItems()) {
                sb.append(String.format("###Item: %s",item.getName())).append(System.lineSeparator());
                sb.append(String.format("###+%d Strength",item.getStrengthBonus())).append(System.lineSeparator());
                sb.append(String.format("###+%d Agility",item.getAgilityBonus())).append(System.lineSeparator());
                sb.append(String.format("###+%d Intelligence",item.getIntelligenceBonus())).append(System.lineSeparator());
                sb.append(String.format("###+%d HitPoints",item.getHitPointsBonus())).append(System.lineSeparator());
                sb.append(String.format("###+%d Damage",item.getDamageBonus())).append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }
}
