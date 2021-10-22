import org.junit.Assert;
import org.junit.Test;

public class kiemthuTest {
    //    kiểm thử lớp tương đương
    @Test
    public void test0() {
        Assert.assertEquals("Lỗi đầu vào 'person' không hợp lệ", kiemthu.indexBMI("CHAU", 60, 1.75));
    }
//    BMI = 19.59

    @Test
    public void test1() {
        Assert.assertEquals("Lỗi đầu vào 'weight' hoặc 'height' không hợp lệ", kiemthu.indexBMI("CHAUA", -60, 1.75));
    }
//    BMI = -19.59

    @Test
    public void test2() {
        Assert.assertEquals("Thiếu cân", kiemthu.indexBMI("CHAUAU", 50, 1.68));
    }
//    BMI = 17.72

    @Test
    public void test3(){
        Assert.assertEquals("Bình thường", kiemthu.indexBMI("CHAUA",55, 1.65));
    }
//    BMI = 20.20

    @Test
    public void test4(){
        Assert.assertEquals("Thừa cân", kiemthu.indexBMI("CHAUA",66, 1.65));
    }
//    BMI = 24.24

    @Test
    public void test5(){
        Assert.assertEquals("Bình thường", kiemthu.indexBMI("CHAUAU",68, 1.66));
    }
//    BMI = 24.68

    @Test
    public void test6(){
        Assert.assertEquals("Béo phì", kiemthu.indexBMI("CHAUA",60, 1.50));
    }
//    BMI = 26.67

    @Test
    public void test7(){
        Assert.assertEquals("Thừa cân", kiemthu.indexBMI("CHAUAU",80, 1.75));
    }
//    BMI = 26.12

    @Test
    public void test8(){
        Assert.assertEquals("Béo phì", kiemthu.indexBMI("CHAUAU",90, 1.65));
    }
//    BMI = 33.06



    //    kiểm thử theo bảng quyết định
    @Test
    public void test9(){
        Assert.assertEquals("Lỗi đầu vào 'weight' hoặc 'height' không hợp lệ", kiemthu.indexBMI("CHAUA",-60, 1.75));
    }
//    BMI = -19.59

    @Test
    public void test10(){
        Assert.assertEquals("Thiếu cân", kiemthu.indexBMI("CHAUA",40, 1.60));
    }
//    BMI = 15.63

    @Test
    public void test11(){
        Assert.assertEquals("Bình thường", kiemthu.indexBMI("CHAUA",60, 1.7));
    }
//    BMI = 20.76

    @Test
    public void test12(){
        Assert.assertEquals("Thừa cân", kiemthu.indexBMI("CHAUA",65, 1.65));
    }
//    BMI = 23.88

    @Test
    public void test13(){
        Assert.assertEquals("Béo phì", kiemthu.indexBMI("CHAUA",80, 1.7));
    }
//    BMI = 27.68

    @Test
    public void test14(){
        Assert.assertEquals("Béo phì", kiemthu.indexBMI("CHAUA",70, 1.65));
    }
//    BMI = 25.71

    @Test
    public void test15(){
        Assert.assertEquals("Lỗi đầu vào 'weight' hoặc 'height' không hợp lệ", kiemthu.indexBMI("CHAUAU",60, -1.60));
    }
//    BMI = ...

    @Test
    public void test16(){
        Assert.assertEquals("Thiếu cân", kiemthu.indexBMI("CHAUAU",55, 1.80));
    }
//    BMI = 16.98

    @Test
    public void test17(){
        Assert.assertEquals("Bình thường", kiemthu.indexBMI("CHAUAU",65, 1.70));
    }
//    BMI = 22.49

    @Test
    public void test18(){
        Assert.assertEquals("Bình thường", kiemthu.indexBMI("CHAUAU",70, 1.70));
    }
//    BMI = 24.22

    @Test
    public void test19(){
        Assert.assertEquals("Thừa cân", kiemthu.indexBMI("CHAUAU",80, 1.72));
    }
//    BMI = 27.04

    @Test
    public void test20(){
        Assert.assertEquals("Béo phì", kiemthu.indexBMI("CHAUAU",90, 1.70));
    }
//    BMI = 31.14

}
