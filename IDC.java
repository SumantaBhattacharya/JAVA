
    public class IDC {
        public static class NotEqualException extends Exception {
            public NotEqualException(String message) {
                super(message);
            }
        }
    
        public static void main(String[] args) {
            float value = 3.15f;
            try {
                if (value != 3.14f) {
                    throw new NotEqualException("The value is not equal to 3.14");
                }
                System.out.println("The value is equal to 3.14");
            } catch (NotEqualException e) {
                e.printStackTrace();
            }
        }
    }
    

