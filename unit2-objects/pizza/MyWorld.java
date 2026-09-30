import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza,361,226);
        pizza.setLocation(300, 300);
        pizza.setLocation(286,291);
        Topping topping = new Topping("Mushrooms");
        addObject(topping,286,291);
        pizza.setLocation(285,300);
        pizza.setLocation(301,306);
        pizza.setLocation(297,304);
        Topping topping2 = new Topping("Pineapple");
        addObject(topping2,297,304);
        pizza.setLocation(319,172);
        topping2.setLocation(473,168);
        pizza.setLocation(298,302);
        Topping topping3 = new Topping("Cheese");
        addObject(topping3,298,302);
        pizza.setLocation(414,307);
        pizza.setLocation(307,239);
        pizza.setLocation(300,300);
        pizza.setLocation(487,153);
        pizza.setLocation(554,129);
        topping2.setLocation(506,129);
        removeObject(topping2);
        pizza.setLocation(300,275);
        pizza.setLocation(488,86);
        topping3.setLocation(307,281);
        pizza.setLocation(301,301);
        topping.setLocation(476,177);
        removeObject(topping);
        pizza.setLocation(295,305);
        addObject(topping,295,305);
        pizza.setLocation(303,306);
        topping3.setLocation(142,208);
        removeObject(topping3);
        pizza.setLocation(307,314);
        pizza.setLocation(304,309);
        pizza.setLocation(307,320);
        pizza.setLocation(312,330);
        pizza.setLocation(320,325);
        pizza.setLocation(324,330);
        Topping topping4 = new Topping("Mushrooms");
        addObject(topping4,524,114);
        Topping topping5 = new Topping("Mushrooms");
        addObject(topping5,251,161);
        Topping topping6 = new Topping("Mushrooms");
        addObject(topping6,380,147);
        Topping topping7 = new Topping("Mushrooms");
        addObject(topping7,98,194);
        Topping topping8 = new Topping("Mushrooms");
        addObject(topping8,171,277);
        Topping topping9 = new Topping("Mushrooms");
        addObject(topping9,428,280);
        Topping topping10 = new Topping("Mushrooms");
        addObject(topping10,542,213);
        Topping topping11 = new Topping("Mushrooms");
        addObject(topping11,60,70);
        Topping topping12 = new Topping("Mushrooms");
        addObject(topping12,272,48);
        Topping topping13 = new Topping("Mushrooms");
        addObject(topping13,43,355);
        Topping topping14 = new Topping("Mushrooms");
        addObject(topping14,500,336);
        Topping topping15 = new Topping("Mushrooms");
        addObject(topping15,420,43);
        Topping topping16 = new Topping("Cheese");
        addObject(topping16,132,125);
        topping6.setLocation(388,176);
        Topping topping17 = new Topping("Pineapple");
        addObject(topping17,388,176);
        topping17.setLocation(130,357);
        topping8.setLocation(215,299);
        topping17.setLocation(175,373);
        topping17.setLocation(433,88);
        topping13.setLocation(60,335);
    }
}
