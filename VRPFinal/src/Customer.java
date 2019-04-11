public class Customer {
	
	private int id; 
	private int demand;
	private int x;
	private int y;
	private boolean isInCluster; 
	
	public Customer(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.isInCluster = false;
	}
		
	/**
	 * 
	 * @return true se o cliente est� em um cluster
	 */
	public boolean isInCluster() {
		return isInCluster;
	}

	public void setInCluster(boolean isInCluster) {
		this.isInCluster = isInCluster;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDemand() {
		return demand;
	}

	public void setDemand(int demand) {
		this.demand = demand;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
    @Override
	public String toString() {
    	//return "Customer [id=" + id + ", demand=" + demand + ", x=" + x
    	//+ ", y=" + y + "" +
						//", isInCluster=" + isInCluster + "" +
    	//"]";
    	return "" + id;
	}

    /**
     * Calcula a dist�ncia euclideana entre o customer e o customer2
     * @param customer2
     * @return dist�ncia entre os dois clientes
     */
	public double euclideanDistance (Customer customer2) {
    	double distance;
    	distance = Math.sqrt((this.x - customer2.x)*(this.x - customer2.x) + (this.y - customer2.y) * (this.y - customer2.y));
		return distance;
	}
    
	/**
	 * Calcula a dist�ncia euclidiana entre a posic�o do customer e ponto (x,y)
	 * @param x
	 * @param y
	 * @return dist�ncia euclideana entre customer e (x,y)
	 */
    public double euclideanDistance (double x, double y) {
    	double distance;
    	distance = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y) * (this.y - y));
		return distance;
	}
	
}
