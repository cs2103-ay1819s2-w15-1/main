package seedu.address.logic.commands;


import org.junit.Test;
import seedu.address.logic.CommandHistory;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.apparel.Apparel;
import seedu.address.model.apparel.ClothingType;
import seedu.address.model.apparel.ClothingTypeValue;
import seedu.address.model.apparel.Color;
import seedu.address.model.apparel.ColorValue;
import seedu.address.model.apparel.Name;

// @@author PhilipPhil
public class RecommendationCommandTest {
    private CommandHistory history = new CommandHistory();
    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();

    @Test
    public void executeEmpty() {
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);
    }

    @Test
    public void executeNotEmptyNoBelt() {
        Name name = new Name("Red Shirt");
        Color color = new Color(ColorValue.RED);
        ClothingType clothingType = new ClothingType(ClothingTypeValue.TOP);
        Apparel apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Blue Jeans");
        color = new Color(ColorValue.BLUE);
        clothingType = new ClothingType(ClothingTypeValue.BOTTOM);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Black Shoes");
        color = new Color(ColorValue.BLACK);
        clothingType = new ClothingType(ClothingTypeValue.SHOES);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        String successMessage = "THE OUTFIT IS:\n"
                                + "Red Shirt Color: RED ClothingType: TOP Available: true Usage-count: 0\n"
                                + "Blue Jeans Color: BLUE ClothingType: BOTTOM Available: true Usage-count: 0\n"
                                + "Black Shoes Color: BLACK ClothingType: SHOES Available: true Usage-count: 0";
        assertCommandSuccess(new RecommendationCommand(), model, history, successMessage, expectedModel);

    }

    @Test
    public void executeNotEmptyWithBelt() {
        Name name = new Name("Red Shirt");
        Color color = new Color(ColorValue.RED);
        ClothingType clothingType = new ClothingType(ClothingTypeValue.TOP);
        Apparel apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Blue Jeans");
        color = new Color(ColorValue.BLUE);
        clothingType = new ClothingType(ClothingTypeValue.BOTTOM);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Black Belt");
        color = new Color(ColorValue.BLACK);
        clothingType = new ClothingType(ClothingTypeValue.BELT);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Black Shoes");
        color = new Color(ColorValue.BLACK);
        clothingType = new ClothingType(ClothingTypeValue.SHOES);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);

        String successMessage = "THE OUTFIT IS:\n"
                + "Red Shirt Color: RED ClothingType: TOP Available: true Usage-count: 0\n"
                + "Blue Jeans Color: BLUE ClothingType: BOTTOM Available: true Usage-count: 0\n"
                + "Black Belt Color: BLACK ClothingType: BELT Available: true Usage-count: 0\n"
                + "Black Shoes Color: BLACK ClothingType: SHOES Available: true Usage-count: 0";
        assertCommandSuccess(new RecommendationCommand(), model, history, successMessage, expectedModel);

    }


    @Test
    public void executeNoShoes() {
        Name name = new Name("Red Shirt");
        Color color = new Color(ColorValue.RED);
        ClothingType clothingType = new ClothingType(ClothingTypeValue.TOP);
        Apparel apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Blue Jeans");
        color = new Color(ColorValue.BLUE);
        clothingType = new ClothingType(ClothingTypeValue.BOTTOM);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Black Belt");
        color = new Color(ColorValue.BLACK);
        clothingType = new ClothingType(ClothingTypeValue.BELT);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);
    }

    @Test
    public void executeNoShirt() {
        Name name = new Name("Blue Jeans");
        Color color = new Color(ColorValue.BLUE);
        ClothingType clothingType = new ClothingType(ClothingTypeValue.BOTTOM);
        Apparel apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Black Belt");
        color = new Color(ColorValue.BLACK);
        clothingType = new ClothingType(ClothingTypeValue.BELT);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Black Shoes");
        color = new Color(ColorValue.BLACK);
        clothingType = new ClothingType(ClothingTypeValue.SHOES);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);

        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

    }


    @Test
    public void executeNoPants() {
        Name name = new Name("Red Shirt");
        Color color = new Color(ColorValue.RED);
        ClothingType clothingType = new ClothingType(ClothingTypeValue.TOP);
        Apparel apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Black Belt");
        color = new Color(ColorValue.BLACK);
        clothingType = new ClothingType(ClothingTypeValue.BELT);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);
        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);

        name = new Name("Black Shoes");
        color = new Color(ColorValue.BLACK);
        clothingType = new ClothingType(ClothingTypeValue.SHOES);
        apparel = new Apparel(name, color, clothingType);
        model.addApparel(apparel);
        expectedModel.addApparel(apparel);

        assertCommandSuccess(new RecommendationCommand(), model, history, RecommendationCommand.MESSAGE_NO_RECOMMENDATION, expectedModel);


    }
}