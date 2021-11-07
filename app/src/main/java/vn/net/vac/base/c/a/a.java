package vn.net.vac.base.c.a;

import java.lang.reflect.Array;
import java.sql.Date;
import java.util.Calendar;

/* compiled from: LunarCalender */
public class a {
    static final double[] a = new double[]{4.974188368183839d, 5.235987755982989d, 5.497787143782138d, 5.759586531581287d, 6.021385919380436d, 0.0d, 0.2617993877991494d, 0.5235987755982988d, 0.7853981633974483d, 1.0471975511965976d, 1.3089969389957472d, 1.5707963267948966d, 1.832595714594046d, 2.0943951023931953d, 2.356194490192345d, 2.6179938779914944d, 2.8797932657906435d, 3.141592653589793d, 3.4033920413889427d, 3.665191429188092d, 3.9269908169872414d, 4.1887902047863905d, 4.4505895925855405d, 4.71238898038469d};
    static final String[] b = new String[]{"14. Bích (Thủy)", "15. Khuê (Mộc)", "16. Lâu (Kim)", "17. Vị (Thổ)", "18. Mão (Nhật)", "19. Tất (Nguyệt)", "20. Chủy (Hỏa)", "21. Sâm (Thủy)", "22. Tỉnh (Mộc)", "23. Quỷ (Kim)", "24. Liễu (Thổ)", "25. Tinh (Nhật)", "26. Trương (Nguyệt)", "27. Dực (Hỏa)", "28. Chẩn (Thủy)", "1. Giác (Mộc)", "2. Cang (Kim)", "3. Đê (Thổ)", "4. Phòng (Nhật)", "5. Tâm (Nguyệt)", "6. Vĩ (Hỏa)", "7. Cơ (Thủy)", "8. Đẩu (Mộc)", "9. Ngưu (Kim)", "10. Nữ (Thổ)", "11. Hư (Nhật)", "12. Nguy (Nguyệt)", "13. Thất (Hỏa)"};
    static final String[] c = new String[]{"Tiểu Hàn", "Đại Hàn", "Lập Xuân", "Vũ Thủy", "Kinh Trập", "Xuân Phân", "Thanh Minh", "Cốc Vũ", "Lập Hạ", "Tiểu Mãn", "Mang Chủng", "Hạ Chí", "Tiểu Thử", "Đại Thử", "Lập Thu", "Xử Thử", "Bạch Lộ", "Thu Phân", "Hàn Lộ", "Sương Giáng", "Lập Đông", "Tiểu Tuyết", "Đại Tuyết", "Đông Chí"};
    static final String[] d = new String[]{"Trực Kiến", "Trực Trừ", "Trực Mãn", "Trực Bình", "Trực Định", "Trực Chấp", "Trực Phá", "Trực Nguy", "Trực Thành", "Trực Thu", "Trực Khai", "Trực Bế"};
    static final String[] e = new String[]{"Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm", "Quý"};
    static final String[] f = new String[]{"Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};
    static final String[] g = new String[]{"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
    static final String[] h = new String[]{"23-1h", "1-3h", "3-5h", "5-7h", "7-9h", "9-11h", "11-13h", "13-15h", "15-17h", "17-19h", "19-21h", "21-23h"};

    static {
        String[] strArr = new String[]{"Thiên Đức", "Nguyệt Đức", "Thiên Giai", "Thiên Hỷ", "Thiên Quý", "Tam Hợp", "Sinh Khí", "Thiên Thành", "Thiên Quan", "Lộc Mã", "Phúc Sinh", "Giải Thần", "Thiên Ân"};
        strArr = new String[]{"Thiên Cương", "Thụ Tử", "Đại Hao\tTử Khí\tQuân Phú", "Tiểu Hao", "Sát Chủ", "Thiên Họa", "Địa Họa", "Hỏa Tai", "Nguyệt Phá", "Băng Tiêu Ngọa Giải", "Thổ Cấm", "Thổ Kỵ\tVãng Vong", "Cô Thần", "Quả Tú", "Trùng Tang", "Trùng Phúc"};
    }

    public static int a(double d) {
        return (int) Math.floor(d);
    }

    static int b(double d) {
        return (int) ((d * 2.0d) % 10.0d);
    }

    public static int[][] b(int i) {
        int[][] iArr;
        Class cls = int.class;
        int[] a = a(i - 1);
        int i2 = 0;
        double r = r(a[0], a[1], a[2]);
        int floor = (int) Math.floor(((r - 2415021.076998695d) / 29.530588853d) + 0.5d);
        int[] a2 = a(i);
        Object obj = r(a2[0], a2[1], a2[2]) - r > 365.0d ? 1 : null;
        if (obj == null) {
            iArr = (int[][]) Array.newInstance(cls, new int[]{13, 5});
        } else {
            iArr = (int[][]) Array.newInstance(cls, new int[]{14, 5});
        }
        iArr[0] = new int[]{a[0], a[1], a[2], 0, 0};
        iArr[iArr.length - 1] = new int[]{a2[0], a2[1], a2[2], 0, 0};
        for (i = 1; i < iArr.length - 1; i++) {
            int[] c = c(c(floor + i));
            iArr[i] = new int[]{c[0], c[1], c[2], 0, 0};
        }
        while (i2 < iArr.length) {
            iArr[i2][3] = a(i2 + 11, 12);
            i2++;
        }
        if (obj != null) {
            a(iArr);
        }
        return iArr;
    }

    public static int[] c(double d) {
        return e(d + 0.2916666666666667d);
    }

    public static double d(double d) {
        d = (d - 2451545.0d) / 36525.0d;
        double d2 = d * d;
        double d3 = (((35999.0503d * d) + 357.5291d) - (1.559E-4d * d2)) - ((4.8E-7d * d) * d2);
        double sin = ((((36000.76983d * d) + 280.46645d) + (3.032E-4d * d2)) + (((((1.9146d - (0.004817d * d)) - (d2 * 1.4E-5d)) * Math.sin(d3 * 0.017453292519943295d)) + ((0.019993d - (d * 1.01E-4d)) * Math.sin(0.03490658503988659d * d3))) + (Math.sin(0.05235987755982989d * d3) * 2.9E-4d))) * 0.017453292519943295d;
        d2 = (double) a(sin / 6.283185307179586d);
        Double.isNaN(d2);
        return sin - (d2 * 6.283185307179586d);
    }

    public static int[] e(double d) {
        int a;
        d += 0.5d;
        int a2 = a(d);
        double d2 = (double) a2;
        Double.isNaN(d2);
        d -= d2;
        if (a2 >= 2299161) {
            Double.isNaN(d2);
            a = a((d2 - 1867216.25d) / 36524.25d);
            a2 = ((a2 + 1) + a) - a((double) (a / 4));
        }
        a2 += 1524;
        d2 = (double) a2;
        Double.isNaN(d2);
        a = a((d2 - 122.1d) / 365.25d);
        double d3 = (double) a;
        Double.isNaN(d3);
        a2 -= a(d3 * 365.25d);
        double d4 = (double) a2;
        Double.isNaN(d4);
        int a3 = a(d4 / 30.6001d);
        double d5 = (double) a3;
        Double.isNaN(d5);
        double a4 = (double) (a2 - a(d5 * 30.6001d));
        Double.isNaN(a4);
        int a5 = a(a4 + d);
        a = (a3 < 14 ? a3 - 1 : a3 - 13) < 3 ? a - 4715 : a - 4716;
        return new int[]{a5, a3 < 14 ? a3 - 1 : a3 - 13, a};
    }

    public static int f(int i, int i2, int i3) {
        return u(i, i2, i3)[0];
    }

    public static String g(int i, int i2, int i3) {
        int[] a = a(i, i2, i3);
        int[] b = b(i, i2, i3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e[a[0]]);
        stringBuilder.append(" ");
        stringBuilder.append(f[b[0]]);
        return stringBuilder.toString();
    }

    public static String h(int i, int i2, int i3) {
        return b[t(i, i2, i3)];
    }

    public static int i(int i, int i2, int i3) {
        return u(i, i2, i3)[1];
    }

    public static String j(int i, int i2, int i3) {
        int[] a = a(i, i2, i3);
        int[] b = b(i, i2, i3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e[a[1]]);
        stringBuilder.append(" ");
        stringBuilder.append(f[b[1]]);
        return stringBuilder.toString();
    }

    public static String k(int i, int i2, int i3) {
        return g[v(i, i2, i3)];
    }

    public static String l(int i, int i2, int i3) {
        return c[w(i, i2, i3)];
    }

    public static String m(int i, int i2, int i3) {
        return d[x(i, i2, i3)];
    }

    public static int[] n(int i, int i2, int i3) {
        switch (b(i, i2, i3)[0]) {
            case 0:
            case 6:
                return new int[]{0, 1, 3, 6, 8, 9};
            case 1:
            case 7:
                return new int[]{2, 3, 5, 8, 10, 11};
            case 2:
            case 8:
                return new int[]{0, 1, 4, 5, 7, 10};
            case 3:
            case 9:
                return new int[]{0, 2, 3, 6, 7, 9};
            case 4:
            case 10:
                return new int[]{2, 4, 5, 8, 9, 11};
            case 5:
            case 11:
                return new int[]{1, 4, 6, 7, 10, 11};
            default:
                return null;
        }
    }

    public static boolean o(int i, int i2, int i3) {
        if (u(i, i2, i3)[0] == 1) {
            return true;
        }
        return false;
    }

    public static boolean p(int i, int i2, int i3) {
        int[] u = u(i, i2, i3);
        if ((u[0] == 1 && u[1] == 1) || ((u[0] == 2 && u[1] == 1) || ((u[0] == 3 && u[1] == 1) || ((u[0] == 10 && u[1] == 3) || (u[0] == 15 && u[1] == 8))))) {
            return true;
        }
        return false;
    }

    public static boolean q(int i, int i2, int i3) {
        return (i == 1 && i2 == 1) ? true : (i == 30 && i2 == 4) ? true : (i == 1 && i2 == 5) ? true : (i == 2 && i2 == 9) ? true : i == 25 && i2 == 12;
    }

    public static double r(int i, int i2, int i3) {
        return y(i, i2, i3) - 0.2916666666666667d;
    }

    public static int s(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = b(i, i2, i3)[0];
        int[] u = u(i, i2, i3);
        i2 = u[0];
        i2 = u[1];
        i = u[2];
        int[] iArr = new int[]{1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0};
        switch (i2) {
            case 1:
            case 7:
                break;
            case 2:
            case 8:
                i4 = 2;
                break;
            case 3:
            case 9:
                i4 = 4;
                break;
            case 4:
            case 10:
                i4 = 6;
                break;
            case 5:
            case 11:
                i4 = 8;
                break;
            case 6:
            case 12:
                i4 = 10;
                break;
            default:
                i4 = -1;
                break;
        }
        if (i4 != -1) {
            return iArr[((i5 - i4) + 12) % 12];
        }
        return -1;
    }

    public static int t(int i, int i2, int i3) {
        return (int) Math.abs(a(1, 1, 1975, i, i2, i3) % 28);
    }

    public static int[] u(int i, int i2, int i3) {
        int[][] b = b(i3);
        int[] iArr = b[b.length - 1];
        double r = r(i, i2, i3);
        if (r >= r(iArr[0], iArr[1], iArr[2])) {
            i3++;
            b = b(i3);
        }
        int length = b.length - 1;
        while (r < r(b[length][0], b[length][1], b[length][2])) {
            length--;
        }
        i = ((int) (r - r(b[length][0], b[length][1], b[length][2]))) + 1;
        if (b[length][3] >= 11) {
            i3--;
        }
        return new int[]{i, b[length][3], i3, b[length][4]};
    }

    public static int v(int i, int i2, int i3) {
        return ((int) (r(i, i2, i3) + 2.5d)) % 7;
    }

    public static int w(int i, int i2, int i3) {
        int[][] d = d(i3);
        if (i != 31) {
            int i4 = i2;
        } else if (i2 == 12) {
            return 23;
        }
        int i5 = 0;
        while (i5 < 24) {
            long a = a(d[i5][0], d[i5][1], i3, i, i2, i3);
            int i6 = i5 + 1;
            long a2 = a(d[i5][0], d[i5][1], i3, d[i6][0], d[i6][1], i3);
            if (a < 0) {
                return 23;
            }
            if (a < a2) {
                return i5;
            }
            i5 = i6;
        }
        return -1;
    }

    public static int x(int i, int i2, int i3) {
        for (int i4 = 0; i4 < 24; i4 += 2) {
            if (a(i, i2, i3, d(i3)[i4][0], d(i3)[i4][1], i3) > 0) {
                return ((b(i, i2, i3)[0] + 12) - (i4 / 2)) % 12;
            }
        }
        return b(i, i2, i3)[0] % 12;
    }

    public static double y(int i, int i2, int i3) {
        double a;
        double d;
        if (i3 > 1582 || ((i3 == 1582 && i2 > 10) || (i3 == 1582 && i2 == 10 && i > 14))) {
            a = (double) (((((i3 * 367) - a((double) (((a((double) ((i2 + 9) / 12)) + i3) * 7) / 4))) - a((double) (((a((double) ((i3 + ((i2 - 9) / 7)) / 100)) + 1) * 3) / 4))) + a((double) ((i2 * 275) / 9))) + i);
            d = 1721028.5d;
            Double.isNaN(a);
        } else {
            a = (double) ((((i3 * 367) - a((double) ((((i3 + 5001) + a((double) ((i2 - 9) / 7))) * 7) / 4))) + a((double) ((i2 * 275) / 9))) + i);
            d = 1729776.5d;
            Double.isNaN(a);
        }
        return a + d;
    }

    public static int a(int i, int i2) {
        double d = (double) i2;
        double d2 = (double) i;
        Double.isNaN(d2);
        Double.isNaN(d);
        d2 = Math.floor(d2 / d);
        Double.isNaN(d);
        i -= (int) (d * d2);
        return i == 0 ? i2 : i;
    }

    public static double c(int i) {
        double d = (double) i;
        Double.isNaN(d);
        double d2 = d / 1236.85d;
        double d3 = d2 * d2;
        double d4 = d3 * d2;
        Double.isNaN(d);
        double sin = ((((29.53058868d * d) + 2415020.75933d) + (1.178E-4d * d3)) - (1.55E-7d * d4)) + (Math.sin((((132.87d * d2) + 166.56d) - (0.009173d * d3)) * 0.017453292519943295d) * 3.3E-4d);
        Double.isNaN(d);
        double d5 = (((29.10535608d * d) + 359.2242d) - (3.33E-5d * d3)) - (3.47E-6d * d4);
        Double.isNaN(d);
        double d6 = (((385.81691806d * d) + 306.0253d) + (0.0107306d * d3)) + (1.236E-5d * d4);
        Double.isNaN(d);
        d = (((d * 390.67050646d) + 21.2964d) - (0.0016528d * d3)) - (2.39E-6d * d4);
        d *= 2.0d;
        return (sin + ((((((((((((((0.1734d - (3.93E-4d * d2)) * Math.sin(d5 * 0.017453292519943295d)) + (Math.sin(0.03490658503988659d * d5) * 0.0021d)) - (Math.sin(d6 * 0.017453292519943295d) * 0.4068d)) + (Math.sin(0.03490658503988659d * d6) * 0.0161d)) - (Math.sin(0.05235987755982989d * d6) * 4.0E-4d)) + (Math.sin(0.03490658503988659d * d) * 0.0104d)) - (Math.sin((d5 + d6) * 0.017453292519943295d) * 0.0051d)) - (Math.sin((d5 - d6) * 0.017453292519943295d) * 0.0074d)) + (Math.sin((d + d5) * 0.017453292519943295d) * 4.0E-4d)) - (Math.sin((d - d5) * 0.017453292519943295d) * 4.0E-4d)) - (Math.sin((d + d6) * 0.017453292519943295d) * 6.0E-4d)) + (Math.sin((d - d6) * 0.017453292519943295d) * 0.001d)) + (Math.sin(((d6 * 2.0d) + d5) * 0.017453292519943295d) * 5.0E-4d))) - (d2 < -11.0d ? ((((8.39E-4d * d2) + 0.001d) + (d3 * 2.261E-4d)) - (8.45E-6d * d4)) - ((d2 * 8.1E-8d) * d4) : ((d2 * 2.65E-4d) - 15247.867904d) + (d3 * 2.62E-4d));
    }

    public static int[] a(int i) {
        i = a((r(31, 12, i) - 2415021.076998695d) / 29.530588853d);
        double c = c(i);
        int[] c2 = c(c);
        if (d(r(c2[0], c2[1], c2[2])) > 4.71238898038469d) {
            c = c(i - 1);
        }
        return c(c);
    }

    public static int[][] d(int i) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{25, 2});
        int i2 = 0;
        int i3 = 5;
        int i4 = 1;
        while (i2 < 24) {
            if (i2 == 5) {
                while (d(r(i3, i4, i)) > a[6]) {
                    i3++;
                }
            } else {
                while (d(r(i3, i4, i)) < a[i2]) {
                    i3++;
                }
            }
            iArr[i2][0] = i3 - 1;
            iArr[i2][1] = i4;
            int[] a = a(i3, i4, i, 14);
            i2++;
            int i5 = a[0];
            i4 = a[1];
            i3 = i5;
        }
        iArr[i2][0] = 31;
        iArr[i2][1] = 12;
        return iArr;
    }

    public static int[] e(int i, int i2, int i3, int i4) {
        if (i2 >= 11) {
            i3++;
        }
        int[][] b = b(i3);
        int[] iArr = null;
        for (int[] iArr2 : b) {
            if (iArr2[3] == i2 && iArr2[4] == i4) {
                iArr = iArr2;
                break;
            }
        }
        if (iArr != null) {
            double r = r(iArr[0], iArr[1], iArr[2]);
            double d = (double) i;
            Double.isNaN(d);
            return c((r + d) - 1.0d);
        }
        throw new RuntimeException("Incorrect input!");
    }

    static void a(int[][] iArr) {
        int i;
        double[] dArr = new double[iArr.length];
        for (i = 0; i < iArr.length; i++) {
            int[] iArr2 = iArr[i];
            dArr[i] = d(r(iArr2[0], iArr2[1], iArr2[2]));
        }
        Object obj = null;
        for (i = 0; i < iArr.length; i++) {
            if (obj != null) {
                iArr[i][3] = a(i + 10, 12);
            } else {
                if ((Math.floor((dArr[i] / 3.141592653589793d) * 6.0d) != Math.floor((dArr[i + 1] / 3.141592653589793d) * 6.0d) ? 1 : null) == null) {
                    iArr[i][4] = 1;
                    iArr[i][3] = a(i + 10, 12);
                    obj = 1;
                }
            }
        }
    }

    public static int d(int i, int i2, int i3) {
        return u(i, i2, i3)[2];
    }

    public static boolean d(int i, int i2, int i3, int i4) {
        i = ((i + 1) / 2) % 12;
        for (int i5 : n(i2, i3, i4)) {
            if (i5 == i) {
                return true;
            }
        }
        return false;
    }

    public static String e(int i, int i2, int i3) {
        int[] a = a(i, i2, i3);
        int[] b = b(i, i2, i3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e[a[2]]);
        stringBuilder.append(" ");
        stringBuilder.append(f[b[2]]);
        return stringBuilder.toString();
    }

    public static int[] b(int i, int i2, int i3) {
        int[] u = u(i, i2, i3);
        int i4 = u[1];
        int i5 = u[2];
        return new int[]{a(r(i, i2, i3) + 2.5d) % 12, (i4 + 1) % 12, (i5 + 8) % 12};
    }

    static int[] c(int i, int i2, int i3, int i4) {
        r1 = new int[2];
        i = ((i + 1) / 2) % 12;
        r1[0] = (b(r(i2, i3, i4)) + i) % 10;
        r1[1] = i;
        return r1;
    }

    public static int b(int i, int i2) {
        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
            return 31;
        }
        if (i == 4 || i == 6 || i == 9 || i == 11) {
            return 30;
        }
        if (i == 2) {
            return ((i2 % 4 != 0 || i2 % 100 == 0) && i2 % 400 != 0) ? 28 : 29;
        } else {
            return 0;
        }
    }

    public static int[] a(int i, int i2, int i3) {
        int[] u = u(i, i2, i3);
        int i4 = u[1];
        int i5 = u[2];
        return new int[]{a(r(i, i2, i3) + 10.5d) % 10, (((i5 * 12) + i4) + 3) % 10, (i5 + 6) % 10};
    }

    public static String b(int i, int i2, int i3, int i4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e[c(i, i2, i3, i4)[0]]);
        stringBuilder.append(" ");
        stringBuilder.append(f[c(i, i2, i3, i4)[1]]);
        return stringBuilder.toString();
    }

    public static String c(int i, int i2, int i3) {
        String str = "";
        for (int i4 = 0; i4 < 6; i4++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(f[n(i, i2, i3)[i4]]);
            stringBuilder.append("(");
            stringBuilder.append(h[n(i, i2, i3)[i4]]);
            stringBuilder.append("), ");
            str = stringBuilder.toString();
        }
        return str;
    }

    public static int[] a(int i, int i2, int i3, int i4) {
        i += i4;
        if (i > b(i2, i3)) {
            i2++;
            if (i2 > 12) {
                i3++;
                i = 1;
                i2 = 1;
            } else {
                i = 1;
            }
        }
        return new int[]{i, i2, i3};
    }

    public static long a(int i, int i2, int i3, int i4, int i5, int i6) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i3);
        String str = "-";
        stringBuilder.append(str);
        stringBuilder.append(i2);
        stringBuilder.append(str);
        stringBuilder.append(i);
        Date valueOf = Date.valueOf(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(i6);
        stringBuilder2.append(str);
        stringBuilder2.append(i5);
        stringBuilder2.append(str);
        stringBuilder2.append(i4);
        Date valueOf2 = Date.valueOf(stringBuilder2.toString());
        instance.setTime(valueOf);
        instance2.setTime(valueOf2);
        return (instance2.getTime().getTime() - instance.getTime().getTime()) / 86400000;
    }
}
