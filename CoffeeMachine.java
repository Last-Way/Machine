public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee cappuccino = new Coffee(200, 100, 12, 1, 6);
        Coffee latte = new Coffee(350, 75, 20, 1, 7);
        Coffee espresso = new Coffee(250, 16, 1, 4);


        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;

/*
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
        System.out.println();

 */
        boolean exit = true;
        while (exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next().trim();


            switch (action) {
                case "exit":
                    exit = false;
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String buyCoffee = scanner.next().trim();
                    char a=buyCoffee.charAt(0);
                    switch (a) {
                        case '1':
                            if (espresso.water > water) {
                                System.out.println("Sorry, not enough water!");
                            } else if (espresso.coffeeBeans > coffeeBeans) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (espresso.disposableCups > disposableCups) {
                                System.out.println("Sorry, not enough disposable cups!");
                            } else if(espresso.water<=water && espresso.coffeeBeans<=coffeeBeans && espresso.disposableCups<=disposableCups){
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= espresso.water;
                                coffeeBeans -= espresso.coffeeBeans;
                                disposableCups -= espresso.disposableCups;
                                money += espresso.money;
                            }
                            break;

                        case '2':
                            if (latte.water > water) {
                                System.out.println("Sorry, not enough water!");
                            } else if (latte.milk > milk) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (latte.coffeeBeans > coffeeBeans) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (latte.disposableCups > disposableCups) {
                                System.out.println("Sorry, not enough disposable cups!");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= latte.water;
                                milk -= latte.milk;
                                coffeeBeans -= latte.coffeeBeans;
                                disposableCups -= latte.disposableCups;
                                money += latte.money;
                            }

                            break;
                        case '3':
                            if (cappuccino.water > water) {
                                System.out.println("Sorry, not enough water!");
                            } else if (cappuccino.milk > milk) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (cappuccino.coffeeBeans > coffeeBeans) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (cappuccino.disposableCups > disposableCups) {
                                System.out.println("Sorry, not enough disposable cups!");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= cappuccino.water;
                                milk -= cappuccino.milk;
                                coffeeBeans -= cappuccino.coffeeBeans;
                                disposableCups -= cappuccino.disposableCups;
                                money += cappuccino.money;
                            }
                            break;
                        case 'b':

                            break;

                    }
                    break;
                case "fill":

                    System.out.println("Write how many ml of water do you want to add:");
                    int aWater = scanner.nextInt();
                    water += aWater;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int bMilk = scanner.nextInt();
                    milk += bMilk;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int cBeans = scanner.nextInt();
                    coffeeBeans += cBeans;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int dCups = scanner.nextInt();
                    disposableCups += dCups;

                    break;

                case "take":
                    System.out.println("I gave you " + money);
                    money -= money;
                    break;
                case "remaining":
                    remaining(water, milk, coffeeBeans, disposableCups, money);
                    break;
                default:
                    break;

            }

        }

    }

    private static void remaining(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        //int a = money - money;
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }

}
  class Coffee {
    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;
    int money;

    public Coffee(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
        this.water = water;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public Coffee(int water, int coffeeBeans, int disposableCups, int money) {
        this.coffeeBeans = coffeeBeans;
        this.water = water;
        this.disposableCups = disposableCups;
        this.money = money;
    }


    }

