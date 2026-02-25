class LinearProbing {
    int[] table = new int[10];

    void insert(int key) {
        int index = key % 10;
        while (table[index] != 0)
            index = (index + 1) % 10;
        table[index] = key;
    }

    void display() {
        for (int i : table)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing();
        lp.insert(10);
        lp.insert(20);
        lp.display();
    }
}
