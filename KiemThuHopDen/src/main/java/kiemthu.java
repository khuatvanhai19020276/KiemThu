public class kiemthu {

    /**
     * Find BMI index.
     *
     *
     * @param person : in person
     * @param weight : in kg
     * @param height : in m
     * @return BMI index
     */

    public static String indexBMI(String person, double weight, double height) {
        String ketqua= "";
        String chaua = "CHAUA";
        String chauau = "CHAUAU";
        if (weight > 0 && height > 0 ) {
            double BMI = weight / (height * height);
            BMI = (double) Math.round(BMI * 100) / 100;
            if (person.equals(chaua)) {
                if (BMI > 0 && BMI < 18.50) {
                    ketqua = "Thiếu cân";
                } else if (BMI >= 18.5 && BMI < 23.00) {
                    ketqua = "Bình thường";
                } else if (BMI >= 23.00 && BMI < 25.00) {
                    ketqua = "Thừa cân";
                } else {
                    ketqua ="Béo phì";
                }
            }
            else if(person.equals(chauau)) {
                if (BMI > 0 && BMI < 18.50) {
                    ketqua =  "Thiếu cân";
                } else if (BMI >= 18.50 && BMI < 25.00) {
                    ketqua =  "Bình thường";
                } else if (BMI >= 25.00 && BMI < 30.00) {
                    ketqua =  "Thừa cân";
                } else {
                    ketqua =  "Béo phì";
                }
            } else {
                ketqua = "Lỗi đầu vào 'person' không hợp lệ";
            }
        } else {
            ketqua = "Lỗi đầu vào 'weight' hoặc 'height' không hợp lệ";
        }
        return ketqua;
    }
}


