package thayTai.Cau1_VII;
    class Circle extends shape {
        private double radius;
    
        public Circle(double radius) {
            this.radius = radius;
        }
    
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    
        @Override
        public String toString() {
            return "Area: " + area();
        }
    }
