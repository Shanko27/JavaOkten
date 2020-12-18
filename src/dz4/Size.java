package dz4;

public enum Size {
    S(48
    ){
        @Override
        public void getDescription() {
            System.out.println("text");
        }},
    M(50
    ){
        @Override
        public void getDescription() {
            System.out.println("text");
        }},
    L(52
    ){
        @Override
        public void getDescription() {
            System.out.println("text");
        }},
    XL(54
    ){
        @Override
        public void getDescription() {
            System.out.println("text");
        }},
    XXL(56
    ){
        @Override
        public void getDescription() {
            System.out.println("text");
        }};

    int euroSize;

    Size(int ruroSize) {
        this.euroSize = ruroSize;
    }

    public int getRuroSize() {
        return euroSize;
    }

    public abstract void getDescription();
}

