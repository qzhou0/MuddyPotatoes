public abstract class Food extends Item{
    public Food(){
	price = 0;
    }
    public /*abstract*/ int	getDelTime(){
	return deliveryTime;
	}

    public /*abstract*/ int getCost(){
	return cost;
        }

}
