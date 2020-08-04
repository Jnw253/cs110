public class Rectangle
    {
        private int xCoordinate;

        private int yCoordinate;


        private int height;


        private int width;

        private String color;

        public Rectangle(int x, int y, int h, int w) {
            xCoordinate = x;
            yCoordinate = y;
            height = h;
            width = w;
        }

            public void setHeight(int h) {
                height = h;
            }
            public void setWidth(int w){
                width = w;
            }
            public void setColor(String c){
                color = c;
            }

            public void setXCoordinate(int newX){
                xCoordinate = newX;
            }
            public void  setYCoordinate(int newY){
                yCoordinate = newY;
            }

            public int getHeight(){
                return height;
            }
            public int getWidth(){
            return width;
            }
            public String getColor(){
            return color;
            }
            public int getXCoordinate(){
            return xCoordinate;
            }
            public int getYCoordinate(){
            return yCoordinate;
            }



    }





