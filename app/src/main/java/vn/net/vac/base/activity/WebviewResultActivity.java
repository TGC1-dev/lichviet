package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.Calendar;
import vn.net.vac.base.c.c;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.n;
import vn.net.vac.base.dbmanager.model.Menh;

public class WebviewResultActivity extends BaseActivity {
    String n;
    private WebView o;
    String p;
    String q;
    int r;
    int s;
    int t;
    int u;

    class a extends WebViewClient {
        a(WebviewResultActivity webviewResultActivity) {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009b A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009b A:{SKIP} */
    /* JADX WARNING: Missing block: B:28:0x0053, code skipped:
            if (r2 != 4) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(int i) {
        int i2 = (i + 6) % 10;
        i2 = (i + 8) % 12;
        int i3 = this.s;
        int i4 = (i3 + 6) % 10;
        i3 = (i3 + 8) % 12;
        int i5 = 4;
        if (i2 == 0 || i2 == 4 || i2 == 8) {
            if (i3 != 2) {
                if (i3 != 3) {
                }
            }
        } else if (i2 == 2 || i2 == 6 || i2 == 10) {
            if (i3 == 8 || i3 == 9 || i3 == 10) {
                return false;
            }
        } else if (i2 == 3 || i2 == 7 || i2 == 11) {
            if (i3 == 5 || i3 == 6 || i3 == 7) {
                return false;
            }
        } else if ((i2 == 1 || i2 == 5 || i2 == 9) && (i3 == 11 || i3 == 0 || i3 == 1)) {
            return false;
        }
        i2 = (this.s - i) + 1;
        i = i2 % 9;
        if (!(i == 1 || i == 3 || i == 6 || i == 8)) {
            i = i2 / 10;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                i5 = 5;
                            } else if (i == 6) {
                                i5 = 6;
                            } else if (i != 7) {
                                if (i != 8) {
                                    if (i != 9) {
                                        if (i != 10) {
                                            i5 = 0;
                                        }
                                    }
                                }
                            }
                        }
                        for (i *= 10; i < i2; i++) {
                            int i6 = i5 + 1;
                            i5 = i6 > 6 ? 1 : i6;
                        }
                        return (i5 != 3 || i5 == 5 || i5 == 6) ? false : true;
                    }
                    i5 = 3;
                    while (i < i2) {
                    }
                    if (i5 != 3) {
                    }
                }
                i5 = 2;
                while (i < i2) {
                }
                if (i5 != 3) {
                }
            }
            i5 = 1;
            while (i < i2) {
            }
            if (i5 != 3) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009b A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009b A:{SKIP} */
    /* JADX WARNING: Missing block: B:28:0x0053, code skipped:
            if (r3 != 4) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c(int i) {
        int i2 = this.r;
        int i3 = (i2 + 6) % 10;
        i2 = (i2 + 8) % 12;
        int i4 = (i + 6) % 10;
        i4 = (i + 8) % 12;
        int i5 = 4;
        if (i2 == 0 || i2 == 4 || i2 == 8) {
            if (i4 != 2) {
                if (i4 != 3) {
                }
            }
        } else if (i2 == 2 || i2 == 6 || i2 == 10) {
            if (i4 == 8 || i4 == 9 || i4 == 10) {
                return false;
            }
        } else if (i2 == 3 || i2 == 7 || i2 == 11) {
            if (i4 == 5 || i4 == 6 || i4 == 7) {
                return false;
            }
        } else if ((i2 == 1 || i2 == 5 || i2 == 9) && (i4 == 11 || i4 == 0 || i4 == 1)) {
            return false;
        }
        i = (i - this.r) + 1;
        i2 = i % 9;
        if (!(i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8)) {
            i2 = i / 10;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                i5 = 5;
                            } else if (i2 == 6) {
                                i5 = 6;
                            } else if (i2 != 7) {
                                if (i2 != 8) {
                                    if (i2 != 9) {
                                        if (i2 != 10) {
                                            i5 = 0;
                                        }
                                    }
                                }
                            }
                        }
                        for (i2 *= 10; i2 < i; i2++) {
                            i3 = i5 + 1;
                            i5 = i3 > 6 ? 1 : i3;
                        }
                        return (i5 != 3 || i5 == 5 || i5 == 6) ? false : true;
                    }
                    i5 = 3;
                    while (i2 < i) {
                    }
                    if (i5 != 3) {
                    }
                }
                i5 = 2;
                while (i2 < i) {
                }
                if (i5 != 3) {
                }
            }
            i5 = 1;
            while (i2 < i) {
            }
            if (i5 != 3) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012b A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private String q() {
        String str;
        Object obj;
        Object[] objArr;
        String str2;
        int i = Calendar.getInstance().get(1);
        int i2 = this.r;
        i = (i - i2) + 1;
        int i3 = (i2 + 6) % 10;
        i2 = (i2 + 8) % 12;
        String format = String.format("%s %s", new Object[]{c.a[i3], c.b[i2]});
        Menh d = vn.net.vac.base.b.a.d(this.r);
        String str3 = d.c.split("-")[1 - this.u];
        int i4 = this.t;
        Object obj2 = (i4 == 1 || i4 == 3 || i4 == 4 || i4 == 8) ? null : 1;
        String str4 = "ly";
        String str5 = "";
        if (str3.toLowerCase().equals("càn")) {
            str = "can";
            str5 = "- Tây Bắc: <font color=\"#ff0000\">Phục vị</font> - Được sự giúp đỡ.<br>- Đông Bắc: <font color=\"#ff0000\">Thiên y</font> - Gặp thiên thời được che chở.<br>- Tây: <font color=\"#ff0000\">Sanh khí</font> (Sinh khí) - Phúc lộc vẹn toàn.<br>- Tây Nam: <font color=\"#ff0000\">Phước đức</font> (Diên niên) - Mọi sự ổn định.";
            str4 = "- Bắc: <font color=\"#09570f\">Lục sát</font> - Nhà có sát khí.<br>- Đông: <font color=\"#09570f\">Ngũ quỉ</font> (Ngũ qui) - Gặp tai hoạ.<br>- Nam: <font color=\"#09570f\">Tuyệt mạng</font> (Tuyệt mệnh) - Chết chóc.<br>- Đông Nam: <font color=\"#09570f\">Họa hại</font> - Nhà có hung khí.";
        } else {
            String str6;
            if (str3.toLowerCase().equals("cấn")) {
                str = "caan";
                str5 = "- Tây Bắc: <font color=\"#ff0000\">Thiên y</font> - Gặp thiên thời được che chở.<br>- Đông Bắc: <font color=\"#ff0000\">Phục vị</font> - Được sự giúp đỡ.<br>- Tây: <font color=\"#ff0000\">Phước đức</font> (Diên niên) - Mọi sự ổn định.<br>- Tây Nam: <font color=\"#ff0000\">Sanh khí</font> (Sinh khí) - Phúc lộc vẹn toàn.";
                str6 = "- Bắc: <font color=\"#09570f\">Ngũ quỉ</font> (Ngũ qui) - Gặp tai hoạ.<br>- Đông: <font color=\"#09570f\">Lục sát</font> - Nhà có sát khí.<br>- Nam: <font color=\"#09570f\">Họa hại</font> - Nhà có hung khí.<br>- Đông Nam: <font color=\"#09570f\">Tuyệt mạng</font> (Tuyệt mệnh) - Chết chóc.";
            } else if (str3.toLowerCase().equals("khôn")) {
                str = "khon";
                str5 = "- Tây Bắc: <font color=\"#ff0000\">Phước đức</font> (Diên niên) - Mọi sự ổn định.<br>- Đông Bắc: <font color=\"#ff0000\">Sanh khí</font> (Sinh khí) - Phúc lộc vẹn toàn.<br>- Tây: <font color=\"#ff0000\">Thiên y</font> - Gặp thiên thời được che chở.<br>- Tây Nam: <font color=\"#ff0000\">Phục vị</font> - Được sự giúp đỡ.";
                str6 = "- Bắc: <font color=\"#09570f\">Tuyệt mạng</font> (Tuyệt mệnh) - Chết chóc.<br>- Đông: <font color=\"#09570f\">Họa hại</font> - Nhà có hung khí.<br>- Nam: <font color=\"#09570f\">Lục sát</font> - Nhà có sát khí.<br>- Đông Nam: <font color=\"#09570f\">Ngũ quỉ</font> (Ngũ qui) - Gặp tai hoạ.";
            } else if (str3.toLowerCase().equals("đoài")) {
                str = "doai";
                str5 = "- Tây Bắc: <font color=\"#ff0000\">Sanh khí</font> (Sinh khí) - Phúc lộc vẹn toàn.<br>- Đông Bắc: <font color=\"#ff0000\">Phước đức</font> (Diên niên) - Mọi sự ổn định.<br>- Tây: <font color=\"#ff0000\">Phục vị</font> - Được sự giúp đỡ.<br>- Tây Nam: <font color=\"#ff0000\">Thiên y</font> - Gặp thiên thời được che chở.";
                str6 = "- Bắc: <font color=\"#09570f\">Họa hại</font> - Nhà có hung khí.<br>- Đông: <font color=\"#09570f\">Tuyệt mạng</font> (Tuyệt mệnh) - Chết chóc.<br>- Nam: <font color=\"#09570f\">Ngũ quỉ</font> (Ngũ qui) - Gặp tai hoạ.<br>- Đông Nam: <font color=\"#09570f\">Lục sát</font> - Nhà có sát khí.";
            } else {
                if (str3.toLowerCase().equals(str4)) {
                    str5 = "- Bắc: <font color=\"#ff0000\">Phước đức</font> (Diên niên) - Mọi sự ổn định.<br>- Đông: <font color=\"#ff0000\">Sanh khí</font> (Sinh khí) - Phúc lộc vẹn toàn.<br>- Nam: <font color=\"#ff0000\">Phục vị</font> - Được sự giúp đỡ.<br>- Đông Nam: <font color=\"#ff0000\">Thiên y</font> - Gặp thiên thời được che chở.";
                    str6 = "- Tây Bắc: <font color=\"#09570f\">Tuyệt mạng</font> (Tuyệt mệnh) - Chết chóc.<br>- Đông Bắc: <font color=\"#09570f\">Họa hại</font> - Nhà có hung khí.<br>- Tây: <font color=\"#09570f\">Ngũ quỉ</font> (Ngũ qui) - Gặp tai hoạ.<br>- Tây Nam: <font color=\"#09570f\">Lục sát</font> - Nhà có sát khí.";
                    str = str4;
                } else if (str3.toLowerCase().equals("khảm")) {
                    str = "kham";
                    str5 = "- Bắc: <font color=\"#ff0000\">Phục vị</font> - Được sự giúp đỡ.<br>- Đông: <font color=\"#ff0000\">Thiên y</font> - Gặp thiên thời được che chở.<br>- Nam: <font color=\"#ff0000\">Phước đức</font> (Diên niên) - Mọi sự ổn định.<br>- Đông Nam: <font color=\"#ff0000\">Sanh khí</font> (Sinh khí) - Phúc lộc vẹn toàn.";
                    str6 = "- Tây Bắc: <font color=\"#09570f\">Lục sát</font> - Nhà có sát khí.<br>- Đông Bắc: <font color=\"#09570f\">Ngũ quỉ</font> (Ngũ qui) - Gặp tai hoạ.<br>- Tây: <font color=\"#09570f\">Họa hại</font> - Nhà có hung khí.<br>- Tây Nam: <font color=\"#09570f\">Tuyệt mạng</font> (Tuyệt mệnh) - Chết chóc.";
                } else if (str3.toLowerCase().equals("chấn")) {
                    str = "chan";
                    str5 = "- Bắc: <font color=\"#ff0000\">Thiên y</font> - Gặp thiên thời được che chở.<br>- Đông: <font color=\"#ff0000\">Phục vị</font> - Được sự giúp đỡ.<br>- Nam: <font color=\"#ff0000\">Sanh khí</font> (Sinh khí) - Phúc lộc vẹn toàn.<br>- Đông Nam: <font color=\"#ff0000\">Phước đức</font> (Diên niên) - Mọi sự ổn định.";
                    str6 = "- Tây Bắc: <font color=\"#09570f\">Ngũ quỉ</font> (Ngũ qui) - Gặp tai hoạ.<br>- Đông Bắc: <font color=\"#09570f\">Lục sát</font> - Nhà có sát khí.<br>- Tây: <font color=\"#09570f\">Tuyệt mạng</font> (Tuyệt mệnh) - Chết chóc.<br>- Tây Nam: <font color=\"#09570f\">Họa hại</font> - Nhà có hung khí.";
                } else if (str3.toLowerCase().equals("tốn")) {
                    str = "ton";
                    str5 = "- Bắc: <font color=\"#ff0000\">Sanh khí</font> (Sinh khí) - Phúc lộc vẹn toàn.<br>- Đông: <font color=\"#ff0000\">Phước đức</font> (Diên niên) - Mọi sự ổn định.<br>- Nam: <font color=\"#ff0000\">Thiên y</font> - Gặp thiên thời được che chở.<br>- Đông Nam: <font color=\"#ff0000\">Phục vị</font> - Được sự giúp đỡ.";
                    str6 = "- Tây Bắc: <font color=\"#09570f\">Họa hại</font> - Nhà có hung khí.<br>- Đông Bắc: <font color=\"#09570f\">Tuyệt mạng</font> (Tuyệt mệnh) - Chết chóc.<br>- Tây: <font color=\"#09570f\">Lục sát</font> - Nhà có sát khí.<br>- Tây Nam: <font color=\"#09570f\">Ngũ quỉ</font> (Ngũ qui) - Gặp tai hoạ.";
                } else {
                    str4 = str5;
                    obj = 1;
                    str = null;
                    objArr = new Object[14];
                    objArr[0] = Integer.valueOf(this.r);
                    objArr[1] = format;
                    objArr[2] = Integer.valueOf(i);
                    objArr[3] = str3;
                    objArr[4] = obj != null ? "Tây Tứ mệnh" : "Đông Tứ mệnh";
                    objArr[5] = d.b;
                    objArr[6] = c.c[this.t - 1];
                    str2 = ((obj != null || obj2 == null) && !(obj == null && obj2 == null)) ? "<font color=\"#09570f\">XẤU</font>" : "<font color=\"#ff0000\">TỐT</font>";
                    objArr[7] = str2;
                    objArr[8] = obj2 != null ? "Tây Tứ trạch" : "Đông Tứ trạch";
                    objArr[9] = str;
                    objArr[10] = Integer.valueOf(300);
                    objArr[11] = Integer.valueOf(150);
                    objArr[12] = str5;
                    objArr[13] = str4;
                    return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p>- Năm sinh âm lịch: %d (%s) - %d tuổi<br>- Quẻ mệnh: %s - thuộc %s<br>- Ngũ hành: %s<br>- Hướng nhà chọn: %s (Hướng %s) - thuộc %s<p style=\"color:#ff0000;\"><b>Mô hình vòng bát quái:</b></p><center><img src=\"%s.png\" width=\"%dpx\" style=\"border-radius: %dpx;\"/></center><p style=\"color:#ff0000;\"><b>Hướng tốt:</b></p>%s<p style=\"color:#09570f;\"><b>Hướng xấu:</b></p>%s</div>", objArr);
                }
                str4 = str6;
                obj = null;
                objArr = new Object[14];
                objArr[0] = Integer.valueOf(this.r);
                objArr[1] = format;
                objArr[2] = Integer.valueOf(i);
                objArr[3] = str3;
                if (obj != null) {
                }
                objArr[4] = obj != null ? "Tây Tứ mệnh" : "Đông Tứ mệnh";
                objArr[5] = d.b;
                objArr[6] = c.c[this.t - 1];
                if (obj != null) {
                }
                objArr[7] = str2;
                if (obj2 != null) {
                }
                objArr[8] = obj2 != null ? "Tây Tứ trạch" : "Đông Tứ trạch";
                objArr[9] = str;
                objArr[10] = Integer.valueOf(300);
                objArr[11] = Integer.valueOf(150);
                objArr[12] = str5;
                objArr[13] = str4;
                return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p>- Năm sinh âm lịch: %d (%s) - %d tuổi<br>- Quẻ mệnh: %s - thuộc %s<br>- Ngũ hành: %s<br>- Hướng nhà chọn: %s (Hướng %s) - thuộc %s<p style=\"color:#ff0000;\"><b>Mô hình vòng bát quái:</b></p><center><img src=\"%s.png\" width=\"%dpx\" style=\"border-radius: %dpx;\"/></center><p style=\"color:#ff0000;\"><b>Hướng tốt:</b></p>%s<p style=\"color:#09570f;\"><b>Hướng xấu:</b></p>%s</div>", objArr);
            }
            str4 = str6;
        }
        obj = 1;
        objArr = new Object[14];
        objArr[0] = Integer.valueOf(this.r);
        objArr[1] = format;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = str3;
        if (obj != null) {
        }
        objArr[4] = obj != null ? "Tây Tứ mệnh" : "Đông Tứ mệnh";
        objArr[5] = d.b;
        objArr[6] = c.c[this.t - 1];
        if (obj != null) {
        }
        objArr[7] = str2;
        if (obj2 != null) {
        }
        objArr[8] = obj2 != null ? "Tây Tứ trạch" : "Đông Tứ trạch";
        objArr[9] = str;
        objArr[10] = Integer.valueOf(300);
        objArr[11] = Integer.valueOf(150);
        objArr[12] = str5;
        objArr[13] = str4;
        return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p>- Năm sinh âm lịch: %d (%s) - %d tuổi<br>- Quẻ mệnh: %s - thuộc %s<br>- Ngũ hành: %s<br>- Hướng nhà chọn: %s (Hướng %s) - thuộc %s<p style=\"color:#ff0000;\"><b>Mô hình vòng bát quái:</b></p><center><img src=\"%s.png\" width=\"%dpx\" style=\"border-radius: %dpx;\"/></center><p style=\"color:#ff0000;\"><b>Hướng tốt:</b></p>%s<p style=\"color:#09570f;\"><b>Hướng xấu:</b></p>%s</div>", objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0165 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0170 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0165 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0170 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0165 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0170 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0165 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0170 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0165 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0170 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0165 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0170 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private String r() {
        Object obj;
        int i;
        int i2;
        String str;
        Object obj2;
        Object obj3;
        int i3;
        int i4;
        int i5;
        String str2;
        String str3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str4;
        int i6;
        String format;
        Object[] objArr;
        String[] strArr;
        String str5;
        String str6;
        int i7 = this.r;
        int i8 = (i7 + 6) % 10;
        i7 = (i7 + 8) % 12;
        String format2 = String.format("%s %s", new Object[]{c.a[i8], c.b[i7]});
        int i9 = this.s;
        int i10 = (i9 + 6) % 10;
        i9 = (i9 + 8) % 12;
        String format3 = String.format("%s %s", new Object[]{c.a[i10], c.b[i9]});
        Menh d = vn.net.vac.base.b.a.d(this.r);
        int i11 = (this.s - this.r) + 1;
        if (i7 == 0 || i7 == 4 || i7 == 8) {
            obj = (i9 == 2 || i9 == 3 || i9 == 4) ? 1 : null;
            i9 = 2;
            i = 3;
            i2 = 4;
        } else if (i7 == 2 || i7 == 6 || i7 == 10) {
            obj = (i9 == 8 || i9 == 9 || i9 == 10) ? 1 : null;
            i9 = 8;
            i = 9;
            i2 = 10;
        } else if (i7 == 3 || i7 == 7 || i7 == 11) {
            obj = (i9 == 5 || i9 == 6 || i9 == 7) ? 1 : null;
            i9 = 5;
            i = 6;
            i2 = 7;
        } else if (i7 == 1 || i7 == 5 || i7 == 9) {
            obj = (i9 == 11 || i9 == 0 || i9 == 1) ? 1 : null;
            i9 = 11;
            i = 0;
            i2 = 1;
        } else {
            obj = null;
            i9 = 0;
            i = 0;
            i2 = 0;
        }
        int i12 = i11 % 9;
        String str7 = "";
        if (i12 == 1) {
            str = " vì phạm vào <b>Kim lâu thân</b> (tức ảnh hưởng tới bản thân mình)";
        } else if (i12 == 3) {
            str = " vì phạm vào <b>Kim lâu thê</b> (tức ảnh hưởng tới vợ)";
        } else if (i12 == 6) {
            str = " vì phạm vào <b>Kim lâu tử</b> (tức ảnh hưởng tới con cái)";
        } else if (i12 == 8) {
            str = " vì phạm vào <b>Kim lâu súc</b> (tức là ngày xưa thì sẽ gây ảnh hưởng tới gia súc, gia cầm; còn ngày nay thì ta có thể coi đó là Kim Lâu kinh tế, gây ảnh hưởng tới thu nhập và tài vận của gia đình)";
        } else {
            obj2 = str7;
            obj3 = null;
            i3 = i11 / 10;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                i4 = 5;
                            } else if (i3 == 6) {
                                i4 = 6;
                            } else if (i3 != 7) {
                                if (i3 != 8) {
                                    if (i3 != 9) {
                                        if (i3 != 10) {
                                            i4 = 0;
                                        }
                                    }
                                }
                            }
                            i5 = i4;
                            for (i3 *= 10; i3 < i11; i3++) {
                                i5++;
                                if (i5 > 6) {
                                    i5 = 1;
                                }
                            }
                            if (i5 != 1) {
                                str2 = "Nhất Cát";
                                str3 = "Nhất cát an cư, thông vạn sự, nghĩa là làm nhà tuổi này sẽ có chốn an cư tốt, mọi việc hanh thông, thuận lợi";
                            } else if (i5 == 2) {
                                str2 = "Nhì Nghi";
                                str3 = "Làm nhà tuổi này sẽ có lợi, nhà cửa hưng vượng, giàu có (Nhì nghi tấn thất địa sinh tài)";
                            } else {
                                String str8;
                                if (i5 == 3) {
                                    str8 = "Tam Địa Sát";
                                    str2 = "Tuổi này làm nhà là phạm, gia chủ sẽ mắc bệnh tật (Tam sát nhơn do giai đắc mệnh)";
                                } else if (i5 == 4) {
                                    str3 = "Làm nhà tuổi này thì phúc lộc sẽ tới (Tứ tấn tài chi phước lộc lai)";
                                    str2 = "Tứ Tấn Tài";
                                } else if (i5 == 5) {
                                    str8 = "Ngũ Thọ Tử";
                                    str2 = "Tuổi này làm nhà là phạm, trong nhà chia rẽ, lâm vào cảnh tử biệt sinh ly (Ngũ tử ly thân phòng tử biệt)";
                                } else if (i5 == 6) {
                                    str8 = "Lục Hoang Ốc";
                                    str2 = "Tuổi này làm nhà cũng bị phạm, khó mà thành đạt được (Lục ốc tạo gia bất khả thành)";
                                } else {
                                    obj4 = null;
                                    str2 = null;
                                    str3 = null;
                                    obj5 = (obj != null && obj3 == null && obj4 == null) ? 1 : null;
                                    obj6 = (obj == null && obj3 == null && obj4 == null) ? 1 : null;
                                    if (obj5 != null) {
                                        StringBuilder stringBuilder;
                                        str7 = null;
                                        for (int i13 = this.s; i13 <= 2050; i13++) {
                                            if (!c(i13)) {
                                                String str9 = str7;
                                            } else if (n.b(str7)) {
                                                str7 = String.format("%d", new Object[]{Integer.valueOf(i13)});
                                            } else {
                                                stringBuilder = new StringBuilder();
                                                stringBuilder.append(str7);
                                                stringBuilder.append(String.format(", %d", new Object[]{Integer.valueOf(i13)}));
                                                str7 = stringBuilder.toString();
                                            }
                                        }
                                        str7 = String.format(" Năm tốt nhất không phạm vào Hoàng Ốc, Tam Tai, Kim Lâu là %s...", new Object[]{str7});
                                        str4 = null;
                                        for (int i14 = 1920; i14 <= 2000; i14++) {
                                            if (b(i14)) {
                                                if (n.b(str4)) {
                                                    str4 = String.format("%d", new Object[]{Integer.valueOf(i14)});
                                                } else {
                                                    stringBuilder = new StringBuilder();
                                                    stringBuilder.append(str4);
                                                    stringBuilder.append(String.format(", %d", new Object[]{Integer.valueOf(i14)}));
                                                    str4 = stringBuilder.toString();
                                                }
                                            }
                                        }
                                        Object[] objArr2 = new Object[1];
                                        i6 = 0;
                                        objArr2[0] = str4;
                                        format = String.format("<p>Nếu do yêu cầu bắt buộc phải xây nhà trong năm nay, cũng có thể tiến hành mượn tuổi của những người nam giới sinh năm %s... (không phạm cả Tam Tai, Kim Lâu và Hoàng Ốc). Nếu được thì nên chọn những người đứng tuổi, thọ, phúc lộc dồi dào, con cháu đông là tốt nhất. Tuy nhiên cần nhớ rằng, việc mượn tuổi để xây nhà là một biện pháp thiên nhiều về tâm lý, mọi chuyện tốt xấu sẽ vẫn xảy ra với chủ nhà chứ không phải vì mượn tuổi mà xảy ra với người kia.</p>", objArr2);
                                        str4 = "<p style=\"color:#ff0000;\"><b>Hướng dẫn làm thủ tục mượn tuổi:</b></p><p><ul><li>Trước khi làm nhà, gia chủ làm giấy tờ bán nhà tượng trưng cho người mượn tuổi.</li><li>Khi Động thổ, người mượn tuổi thay gia chủ tiến hành khấn vái và động thổ.</li><li>Trong thời gian làm lễ, gia chủ phải lánh xa khỏi khu vực hành lễ.</li><li>Các công đoạn Đổ mái, người mượn tuổi vẫn tiến hành thay gia chủ làm lễ, gia chủ tiếp tục tránh mặt.</li><li>Khi Nhập trạch, người mượn tuổi làm nốt các thủ tục dâng hương, khấn thành, rồi bàn giao lại nhà cho gia chủ.</li><li>Gia chủ làm giấy tờ mua lại nhà (với giá cao hơn giá bán nhà ở trên) và khấn cầu lễ nhập trạch.</li></ul></p>";
                                    } else {
                                        i6 = 0;
                                        format = str7;
                                        str4 = format;
                                    }
                                    objArr = new Object[32];
                                    objArr[i6] = Integer.valueOf(this.r);
                                    objArr[1] = format2;
                                    objArr[2] = d.b;
                                    objArr[3] = Integer.valueOf(this.s);
                                    objArr[4] = format3;
                                    objArr[5] = Integer.valueOf(i11);
                                    objArr[6] = format2;
                                    strArr = c.b;
                                    objArr[7] = strArr[i9];
                                    objArr[8] = strArr[i];
                                    objArr[9] = strArr[i2];
                                    objArr[10] = Integer.valueOf(this.s);
                                    objArr[11] = format3;
                                    str5 = "phạm";
                                    str6 = "không phạm";
                                    objArr[12] = obj == null ? str5 : str6;
                                    objArr[13] = Integer.valueOf(this.s);
                                    objArr[14] = Integer.valueOf(i11);
                                    objArr[15] = obj3 == null ? str5 : str6;
                                    objArr[16] = obj2;
                                    objArr[17] = Integer.valueOf(this.s);
                                    objArr[18] = Integer.valueOf(i11);
                                    objArr[19] = obj4 == null ? str5 : str6;
                                    objArr[20] = str2;
                                    objArr[21] = obj4 == null ? "Xấu" : "Tốt";
                                    objArr[22] = str3;
                                    objArr[23] = Integer.valueOf(this.s);
                                    objArr[24] = format3;
                                    str2 = obj5 == null ? "Rất tốt để" : obj6 != null ? "Không nên" : "Không thể";
                                    objArr[25] = str2;
                                    objArr[26] = obj == null ? str5 : str6;
                                    objArr[27] = obj3 == null ? str5 : str6;
                                    if (obj4 == null) {
                                        str5 = str6;
                                    }
                                    objArr[28] = str5;
                                    objArr[29] = str7;
                                    objArr[30] = format;
                                    objArr[31] = str4;
                                    return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p><p><ul><li>Năm sinh âm lịch: <b>%d</b> (%s)</li><li>Mệnh: %s</li><li>Năm dự kiến xây nhà: <b>%d</b> - %s - <b>%d</b> tuổi</li></ul></p><p>Việc chọn thời điểm xây nhà là vô cùng quan trọng. Khi đã chọn được vị trí tốt để xây nhà, thiết kế hướng và các yếu tố trong ngôi nhà phù hợp, thì công việc còn lại là xác định thời điểm xây nhà, tức là xác định yếu tố \"Thiên Thời\". Nếu việc lựa chọn thời điểm xây dựng, tức ngày, giờ, tháng năm tốt sẽ khiến cho Phong Thuỷ nhà ở đã tốt càng tốt hơn gấp bội, gia chủ sẽ nhanh chóng thịnh vượng, tài vận hanh thông. Ngược lại, việc chọn ngày, giờ, tháng năm xây nhà không tốt, nhất là vi phạm các cấm kỵ Phong Thuỷ thì làm giảm sự tốt đẹp của Phong Thuỷ ngôi nhà, gây suy bại và nhiều điều xấu cho gia đình.</p><p style=\"color:#ff0000;\"><b>Phân tích các yếu tố Tam Tai, Kim Lâu, Hoàng Ốc:</b></p><u>Tam tai</u>: Gia chủ tuổi <b>%s</b>, cần tránh các năm tam tai: <b>%s, %s, %s</b>. Năm dự kiến xây nhà là năm <b>%d</b> tức năm <b>%s</b>, như vậy sẽ <b>%s tam tai</b>.<p><u>Kim lâu</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s kim lâu</b>%s.</p><p><u>Hoàng ốc</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s hoàng ốc</b> vì có hoàng ốc nơi vào là cung <b>%s</b> là <b>%s</b>, %s.</p><p>Nếu cả ba yếu tố trên đều không bị phạm là tốt nhất, còn nếu phạm Tam Tai mà không phạm Kim Lâu, Hoàng Ốc thì cũng có thể chấp nhận được. Phạm vào Kim Lâu hoặc Hoàng Ốc thì tuyệt đối không nên tiến hành xây dựng, sửa chữa nhà cửa, mà nên đợi năm khác, hoặc tiến hành thủ tục mượn tuổi.</p><p>Trường hợp này, năm xây nhà là năm <b>%d</b>, tức năm <b>%s</b>, %s tiến hành xây dựng, sửa chữa nhà cửa vì tuổi của gia chủ đã <b>%s tam tai</b>, <b>%s kim lâu</b>, <b>%s hoàng ốc</b>.%s%s%s<p style=\"color:#ff0000;\"><b>Quy trình khấn lễ động thổ:</b></p><p><ul><li>Trong lễ động thổ ngày xưa phải cúng tam sinh, ngày nay đơn giản hơn, nhưng phải là con gà, đĩa xôi, hương, hoa quả, vàng mã...</li><li>Sau khi làm lễ gia chủ (hoặc người được mượn tuổi nếu có) là người cầm cuốc bổ những nhát đầu tiên, trình với Thổ thần xin được động thổ, tiếp sau đó, mới cho thợ đào.</li><li>Trước khi khấn phải thắp nén nhang vái bốn phương, tám hướng rồi quay mặt vào mâm lễ mà khấn.</li></ul></p></p></div>", objArr);
                                }
                                str3 = str2;
                                str2 = str8;
                                obj4 = 1;
                                if (obj != null) {
                                }
                                if (obj == null) {
                                }
                                if (obj5 != null) {
                                }
                                objArr = new Object[32];
                                objArr[i6] = Integer.valueOf(this.r);
                                objArr[1] = format2;
                                objArr[2] = d.b;
                                objArr[3] = Integer.valueOf(this.s);
                                objArr[4] = format3;
                                objArr[5] = Integer.valueOf(i11);
                                objArr[6] = format2;
                                strArr = c.b;
                                objArr[7] = strArr[i9];
                                objArr[8] = strArr[i];
                                objArr[9] = strArr[i2];
                                objArr[10] = Integer.valueOf(this.s);
                                objArr[11] = format3;
                                str5 = "phạm";
                                str6 = "không phạm";
                                if (obj == null) {
                                }
                                objArr[12] = obj == null ? str5 : str6;
                                objArr[13] = Integer.valueOf(this.s);
                                objArr[14] = Integer.valueOf(i11);
                                if (obj3 == null) {
                                }
                                objArr[15] = obj3 == null ? str5 : str6;
                                objArr[16] = obj2;
                                objArr[17] = Integer.valueOf(this.s);
                                objArr[18] = Integer.valueOf(i11);
                                if (obj4 == null) {
                                }
                                objArr[19] = obj4 == null ? str5 : str6;
                                objArr[20] = str2;
                                if (obj4 == null) {
                                }
                                objArr[21] = obj4 == null ? "Xấu" : "Tốt";
                                objArr[22] = str3;
                                objArr[23] = Integer.valueOf(this.s);
                                objArr[24] = format3;
                                if (obj5 == null) {
                                }
                                objArr[25] = str2;
                                if (obj == null) {
                                }
                                objArr[26] = obj == null ? str5 : str6;
                                if (obj3 == null) {
                                }
                                objArr[27] = obj3 == null ? str5 : str6;
                                if (obj4 == null) {
                                }
                                objArr[28] = str5;
                                objArr[29] = str7;
                                objArr[30] = format;
                                objArr[31] = str4;
                                return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p><p><ul><li>Năm sinh âm lịch: <b>%d</b> (%s)</li><li>Mệnh: %s</li><li>Năm dự kiến xây nhà: <b>%d</b> - %s - <b>%d</b> tuổi</li></ul></p><p>Việc chọn thời điểm xây nhà là vô cùng quan trọng. Khi đã chọn được vị trí tốt để xây nhà, thiết kế hướng và các yếu tố trong ngôi nhà phù hợp, thì công việc còn lại là xác định thời điểm xây nhà, tức là xác định yếu tố \"Thiên Thời\". Nếu việc lựa chọn thời điểm xây dựng, tức ngày, giờ, tháng năm tốt sẽ khiến cho Phong Thuỷ nhà ở đã tốt càng tốt hơn gấp bội, gia chủ sẽ nhanh chóng thịnh vượng, tài vận hanh thông. Ngược lại, việc chọn ngày, giờ, tháng năm xây nhà không tốt, nhất là vi phạm các cấm kỵ Phong Thuỷ thì làm giảm sự tốt đẹp của Phong Thuỷ ngôi nhà, gây suy bại và nhiều điều xấu cho gia đình.</p><p style=\"color:#ff0000;\"><b>Phân tích các yếu tố Tam Tai, Kim Lâu, Hoàng Ốc:</b></p><u>Tam tai</u>: Gia chủ tuổi <b>%s</b>, cần tránh các năm tam tai: <b>%s, %s, %s</b>. Năm dự kiến xây nhà là năm <b>%d</b> tức năm <b>%s</b>, như vậy sẽ <b>%s tam tai</b>.<p><u>Kim lâu</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s kim lâu</b>%s.</p><p><u>Hoàng ốc</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s hoàng ốc</b> vì có hoàng ốc nơi vào là cung <b>%s</b> là <b>%s</b>, %s.</p><p>Nếu cả ba yếu tố trên đều không bị phạm là tốt nhất, còn nếu phạm Tam Tai mà không phạm Kim Lâu, Hoàng Ốc thì cũng có thể chấp nhận được. Phạm vào Kim Lâu hoặc Hoàng Ốc thì tuyệt đối không nên tiến hành xây dựng, sửa chữa nhà cửa, mà nên đợi năm khác, hoặc tiến hành thủ tục mượn tuổi.</p><p>Trường hợp này, năm xây nhà là năm <b>%d</b>, tức năm <b>%s</b>, %s tiến hành xây dựng, sửa chữa nhà cửa vì tuổi của gia chủ đã <b>%s tam tai</b>, <b>%s kim lâu</b>, <b>%s hoàng ốc</b>.%s%s%s<p style=\"color:#ff0000;\"><b>Quy trình khấn lễ động thổ:</b></p><p><ul><li>Trong lễ động thổ ngày xưa phải cúng tam sinh, ngày nay đơn giản hơn, nhưng phải là con gà, đĩa xôi, hương, hoa quả, vàng mã...</li><li>Sau khi làm lễ gia chủ (hoặc người được mượn tuổi nếu có) là người cầm cuốc bổ những nhát đầu tiên, trình với Thổ thần xin được động thổ, tiếp sau đó, mới cho thợ đào.</li><li>Trước khi khấn phải thắp nén nhang vái bốn phương, tám hướng rồi quay mặt vào mâm lễ mà khấn.</li></ul></p></p></div>", objArr);
                            }
                            obj4 = null;
                            if (obj != null) {
                            }
                            if (obj == null) {
                            }
                            if (obj5 != null) {
                            }
                            objArr = new Object[32];
                            objArr[i6] = Integer.valueOf(this.r);
                            objArr[1] = format2;
                            objArr[2] = d.b;
                            objArr[3] = Integer.valueOf(this.s);
                            objArr[4] = format3;
                            objArr[5] = Integer.valueOf(i11);
                            objArr[6] = format2;
                            strArr = c.b;
                            objArr[7] = strArr[i9];
                            objArr[8] = strArr[i];
                            objArr[9] = strArr[i2];
                            objArr[10] = Integer.valueOf(this.s);
                            objArr[11] = format3;
                            str5 = "phạm";
                            str6 = "không phạm";
                            if (obj == null) {
                            }
                            objArr[12] = obj == null ? str5 : str6;
                            objArr[13] = Integer.valueOf(this.s);
                            objArr[14] = Integer.valueOf(i11);
                            if (obj3 == null) {
                            }
                            objArr[15] = obj3 == null ? str5 : str6;
                            objArr[16] = obj2;
                            objArr[17] = Integer.valueOf(this.s);
                            objArr[18] = Integer.valueOf(i11);
                            if (obj4 == null) {
                            }
                            objArr[19] = obj4 == null ? str5 : str6;
                            objArr[20] = str2;
                            if (obj4 == null) {
                            }
                            objArr[21] = obj4 == null ? "Xấu" : "Tốt";
                            objArr[22] = str3;
                            objArr[23] = Integer.valueOf(this.s);
                            objArr[24] = format3;
                            if (obj5 == null) {
                            }
                            objArr[25] = str2;
                            if (obj == null) {
                            }
                            objArr[26] = obj == null ? str5 : str6;
                            if (obj3 == null) {
                            }
                            objArr[27] = obj3 == null ? str5 : str6;
                            if (obj4 == null) {
                            }
                            objArr[28] = str5;
                            objArr[29] = str7;
                            objArr[30] = format;
                            objArr[31] = str4;
                            return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p><p><ul><li>Năm sinh âm lịch: <b>%d</b> (%s)</li><li>Mệnh: %s</li><li>Năm dự kiến xây nhà: <b>%d</b> - %s - <b>%d</b> tuổi</li></ul></p><p>Việc chọn thời điểm xây nhà là vô cùng quan trọng. Khi đã chọn được vị trí tốt để xây nhà, thiết kế hướng và các yếu tố trong ngôi nhà phù hợp, thì công việc còn lại là xác định thời điểm xây nhà, tức là xác định yếu tố \"Thiên Thời\". Nếu việc lựa chọn thời điểm xây dựng, tức ngày, giờ, tháng năm tốt sẽ khiến cho Phong Thuỷ nhà ở đã tốt càng tốt hơn gấp bội, gia chủ sẽ nhanh chóng thịnh vượng, tài vận hanh thông. Ngược lại, việc chọn ngày, giờ, tháng năm xây nhà không tốt, nhất là vi phạm các cấm kỵ Phong Thuỷ thì làm giảm sự tốt đẹp của Phong Thuỷ ngôi nhà, gây suy bại và nhiều điều xấu cho gia đình.</p><p style=\"color:#ff0000;\"><b>Phân tích các yếu tố Tam Tai, Kim Lâu, Hoàng Ốc:</b></p><u>Tam tai</u>: Gia chủ tuổi <b>%s</b>, cần tránh các năm tam tai: <b>%s, %s, %s</b>. Năm dự kiến xây nhà là năm <b>%d</b> tức năm <b>%s</b>, như vậy sẽ <b>%s tam tai</b>.<p><u>Kim lâu</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s kim lâu</b>%s.</p><p><u>Hoàng ốc</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s hoàng ốc</b> vì có hoàng ốc nơi vào là cung <b>%s</b> là <b>%s</b>, %s.</p><p>Nếu cả ba yếu tố trên đều không bị phạm là tốt nhất, còn nếu phạm Tam Tai mà không phạm Kim Lâu, Hoàng Ốc thì cũng có thể chấp nhận được. Phạm vào Kim Lâu hoặc Hoàng Ốc thì tuyệt đối không nên tiến hành xây dựng, sửa chữa nhà cửa, mà nên đợi năm khác, hoặc tiến hành thủ tục mượn tuổi.</p><p>Trường hợp này, năm xây nhà là năm <b>%d</b>, tức năm <b>%s</b>, %s tiến hành xây dựng, sửa chữa nhà cửa vì tuổi của gia chủ đã <b>%s tam tai</b>, <b>%s kim lâu</b>, <b>%s hoàng ốc</b>.%s%s%s<p style=\"color:#ff0000;\"><b>Quy trình khấn lễ động thổ:</b></p><p><ul><li>Trong lễ động thổ ngày xưa phải cúng tam sinh, ngày nay đơn giản hơn, nhưng phải là con gà, đĩa xôi, hương, hoa quả, vàng mã...</li><li>Sau khi làm lễ gia chủ (hoặc người được mượn tuổi nếu có) là người cầm cuốc bổ những nhát đầu tiên, trình với Thổ thần xin được động thổ, tiếp sau đó, mới cho thợ đào.</li><li>Trước khi khấn phải thắp nén nhang vái bốn phương, tám hướng rồi quay mặt vào mâm lễ mà khấn.</li></ul></p></p></div>", objArr);
                        }
                        i4 = 4;
                        i5 = i4;
                        while (i3 < i11) {
                        }
                        if (i5 != 1) {
                        }
                        obj4 = null;
                        if (obj != null) {
                        }
                        if (obj == null) {
                        }
                        if (obj5 != null) {
                        }
                        objArr = new Object[32];
                        objArr[i6] = Integer.valueOf(this.r);
                        objArr[1] = format2;
                        objArr[2] = d.b;
                        objArr[3] = Integer.valueOf(this.s);
                        objArr[4] = format3;
                        objArr[5] = Integer.valueOf(i11);
                        objArr[6] = format2;
                        strArr = c.b;
                        objArr[7] = strArr[i9];
                        objArr[8] = strArr[i];
                        objArr[9] = strArr[i2];
                        objArr[10] = Integer.valueOf(this.s);
                        objArr[11] = format3;
                        str5 = "phạm";
                        str6 = "không phạm";
                        if (obj == null) {
                        }
                        objArr[12] = obj == null ? str5 : str6;
                        objArr[13] = Integer.valueOf(this.s);
                        objArr[14] = Integer.valueOf(i11);
                        if (obj3 == null) {
                        }
                        objArr[15] = obj3 == null ? str5 : str6;
                        objArr[16] = obj2;
                        objArr[17] = Integer.valueOf(this.s);
                        objArr[18] = Integer.valueOf(i11);
                        if (obj4 == null) {
                        }
                        objArr[19] = obj4 == null ? str5 : str6;
                        objArr[20] = str2;
                        if (obj4 == null) {
                        }
                        objArr[21] = obj4 == null ? "Xấu" : "Tốt";
                        objArr[22] = str3;
                        objArr[23] = Integer.valueOf(this.s);
                        objArr[24] = format3;
                        if (obj5 == null) {
                        }
                        objArr[25] = str2;
                        if (obj == null) {
                        }
                        objArr[26] = obj == null ? str5 : str6;
                        if (obj3 == null) {
                        }
                        objArr[27] = obj3 == null ? str5 : str6;
                        if (obj4 == null) {
                        }
                        objArr[28] = str5;
                        objArr[29] = str7;
                        objArr[30] = format;
                        objArr[31] = str4;
                        return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p><p><ul><li>Năm sinh âm lịch: <b>%d</b> (%s)</li><li>Mệnh: %s</li><li>Năm dự kiến xây nhà: <b>%d</b> - %s - <b>%d</b> tuổi</li></ul></p><p>Việc chọn thời điểm xây nhà là vô cùng quan trọng. Khi đã chọn được vị trí tốt để xây nhà, thiết kế hướng và các yếu tố trong ngôi nhà phù hợp, thì công việc còn lại là xác định thời điểm xây nhà, tức là xác định yếu tố \"Thiên Thời\". Nếu việc lựa chọn thời điểm xây dựng, tức ngày, giờ, tháng năm tốt sẽ khiến cho Phong Thuỷ nhà ở đã tốt càng tốt hơn gấp bội, gia chủ sẽ nhanh chóng thịnh vượng, tài vận hanh thông. Ngược lại, việc chọn ngày, giờ, tháng năm xây nhà không tốt, nhất là vi phạm các cấm kỵ Phong Thuỷ thì làm giảm sự tốt đẹp của Phong Thuỷ ngôi nhà, gây suy bại và nhiều điều xấu cho gia đình.</p><p style=\"color:#ff0000;\"><b>Phân tích các yếu tố Tam Tai, Kim Lâu, Hoàng Ốc:</b></p><u>Tam tai</u>: Gia chủ tuổi <b>%s</b>, cần tránh các năm tam tai: <b>%s, %s, %s</b>. Năm dự kiến xây nhà là năm <b>%d</b> tức năm <b>%s</b>, như vậy sẽ <b>%s tam tai</b>.<p><u>Kim lâu</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s kim lâu</b>%s.</p><p><u>Hoàng ốc</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s hoàng ốc</b> vì có hoàng ốc nơi vào là cung <b>%s</b> là <b>%s</b>, %s.</p><p>Nếu cả ba yếu tố trên đều không bị phạm là tốt nhất, còn nếu phạm Tam Tai mà không phạm Kim Lâu, Hoàng Ốc thì cũng có thể chấp nhận được. Phạm vào Kim Lâu hoặc Hoàng Ốc thì tuyệt đối không nên tiến hành xây dựng, sửa chữa nhà cửa, mà nên đợi năm khác, hoặc tiến hành thủ tục mượn tuổi.</p><p>Trường hợp này, năm xây nhà là năm <b>%d</b>, tức năm <b>%s</b>, %s tiến hành xây dựng, sửa chữa nhà cửa vì tuổi của gia chủ đã <b>%s tam tai</b>, <b>%s kim lâu</b>, <b>%s hoàng ốc</b>.%s%s%s<p style=\"color:#ff0000;\"><b>Quy trình khấn lễ động thổ:</b></p><p><ul><li>Trong lễ động thổ ngày xưa phải cúng tam sinh, ngày nay đơn giản hơn, nhưng phải là con gà, đĩa xôi, hương, hoa quả, vàng mã...</li><li>Sau khi làm lễ gia chủ (hoặc người được mượn tuổi nếu có) là người cầm cuốc bổ những nhát đầu tiên, trình với Thổ thần xin được động thổ, tiếp sau đó, mới cho thợ đào.</li><li>Trước khi khấn phải thắp nén nhang vái bốn phương, tám hướng rồi quay mặt vào mâm lễ mà khấn.</li></ul></p></p></div>", objArr);
                    }
                    i4 = 3;
                    i5 = i4;
                    while (i3 < i11) {
                    }
                    if (i5 != 1) {
                    }
                    obj4 = null;
                    if (obj != null) {
                    }
                    if (obj == null) {
                    }
                    if (obj5 != null) {
                    }
                    objArr = new Object[32];
                    objArr[i6] = Integer.valueOf(this.r);
                    objArr[1] = format2;
                    objArr[2] = d.b;
                    objArr[3] = Integer.valueOf(this.s);
                    objArr[4] = format3;
                    objArr[5] = Integer.valueOf(i11);
                    objArr[6] = format2;
                    strArr = c.b;
                    objArr[7] = strArr[i9];
                    objArr[8] = strArr[i];
                    objArr[9] = strArr[i2];
                    objArr[10] = Integer.valueOf(this.s);
                    objArr[11] = format3;
                    str5 = "phạm";
                    str6 = "không phạm";
                    if (obj == null) {
                    }
                    objArr[12] = obj == null ? str5 : str6;
                    objArr[13] = Integer.valueOf(this.s);
                    objArr[14] = Integer.valueOf(i11);
                    if (obj3 == null) {
                    }
                    objArr[15] = obj3 == null ? str5 : str6;
                    objArr[16] = obj2;
                    objArr[17] = Integer.valueOf(this.s);
                    objArr[18] = Integer.valueOf(i11);
                    if (obj4 == null) {
                    }
                    objArr[19] = obj4 == null ? str5 : str6;
                    objArr[20] = str2;
                    if (obj4 == null) {
                    }
                    objArr[21] = obj4 == null ? "Xấu" : "Tốt";
                    objArr[22] = str3;
                    objArr[23] = Integer.valueOf(this.s);
                    objArr[24] = format3;
                    if (obj5 == null) {
                    }
                    objArr[25] = str2;
                    if (obj == null) {
                    }
                    objArr[26] = obj == null ? str5 : str6;
                    if (obj3 == null) {
                    }
                    objArr[27] = obj3 == null ? str5 : str6;
                    if (obj4 == null) {
                    }
                    objArr[28] = str5;
                    objArr[29] = str7;
                    objArr[30] = format;
                    objArr[31] = str4;
                    return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p><p><ul><li>Năm sinh âm lịch: <b>%d</b> (%s)</li><li>Mệnh: %s</li><li>Năm dự kiến xây nhà: <b>%d</b> - %s - <b>%d</b> tuổi</li></ul></p><p>Việc chọn thời điểm xây nhà là vô cùng quan trọng. Khi đã chọn được vị trí tốt để xây nhà, thiết kế hướng và các yếu tố trong ngôi nhà phù hợp, thì công việc còn lại là xác định thời điểm xây nhà, tức là xác định yếu tố \"Thiên Thời\". Nếu việc lựa chọn thời điểm xây dựng, tức ngày, giờ, tháng năm tốt sẽ khiến cho Phong Thuỷ nhà ở đã tốt càng tốt hơn gấp bội, gia chủ sẽ nhanh chóng thịnh vượng, tài vận hanh thông. Ngược lại, việc chọn ngày, giờ, tháng năm xây nhà không tốt, nhất là vi phạm các cấm kỵ Phong Thuỷ thì làm giảm sự tốt đẹp của Phong Thuỷ ngôi nhà, gây suy bại và nhiều điều xấu cho gia đình.</p><p style=\"color:#ff0000;\"><b>Phân tích các yếu tố Tam Tai, Kim Lâu, Hoàng Ốc:</b></p><u>Tam tai</u>: Gia chủ tuổi <b>%s</b>, cần tránh các năm tam tai: <b>%s, %s, %s</b>. Năm dự kiến xây nhà là năm <b>%d</b> tức năm <b>%s</b>, như vậy sẽ <b>%s tam tai</b>.<p><u>Kim lâu</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s kim lâu</b>%s.</p><p><u>Hoàng ốc</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s hoàng ốc</b> vì có hoàng ốc nơi vào là cung <b>%s</b> là <b>%s</b>, %s.</p><p>Nếu cả ba yếu tố trên đều không bị phạm là tốt nhất, còn nếu phạm Tam Tai mà không phạm Kim Lâu, Hoàng Ốc thì cũng có thể chấp nhận được. Phạm vào Kim Lâu hoặc Hoàng Ốc thì tuyệt đối không nên tiến hành xây dựng, sửa chữa nhà cửa, mà nên đợi năm khác, hoặc tiến hành thủ tục mượn tuổi.</p><p>Trường hợp này, năm xây nhà là năm <b>%d</b>, tức năm <b>%s</b>, %s tiến hành xây dựng, sửa chữa nhà cửa vì tuổi của gia chủ đã <b>%s tam tai</b>, <b>%s kim lâu</b>, <b>%s hoàng ốc</b>.%s%s%s<p style=\"color:#ff0000;\"><b>Quy trình khấn lễ động thổ:</b></p><p><ul><li>Trong lễ động thổ ngày xưa phải cúng tam sinh, ngày nay đơn giản hơn, nhưng phải là con gà, đĩa xôi, hương, hoa quả, vàng mã...</li><li>Sau khi làm lễ gia chủ (hoặc người được mượn tuổi nếu có) là người cầm cuốc bổ những nhát đầu tiên, trình với Thổ thần xin được động thổ, tiếp sau đó, mới cho thợ đào.</li><li>Trước khi khấn phải thắp nén nhang vái bốn phương, tám hướng rồi quay mặt vào mâm lễ mà khấn.</li></ul></p></p></div>", objArr);
                }
                i4 = 2;
                i5 = i4;
                while (i3 < i11) {
                }
                if (i5 != 1) {
                }
                obj4 = null;
                if (obj != null) {
                }
                if (obj == null) {
                }
                if (obj5 != null) {
                }
                objArr = new Object[32];
                objArr[i6] = Integer.valueOf(this.r);
                objArr[1] = format2;
                objArr[2] = d.b;
                objArr[3] = Integer.valueOf(this.s);
                objArr[4] = format3;
                objArr[5] = Integer.valueOf(i11);
                objArr[6] = format2;
                strArr = c.b;
                objArr[7] = strArr[i9];
                objArr[8] = strArr[i];
                objArr[9] = strArr[i2];
                objArr[10] = Integer.valueOf(this.s);
                objArr[11] = format3;
                str5 = "phạm";
                str6 = "không phạm";
                if (obj == null) {
                }
                objArr[12] = obj == null ? str5 : str6;
                objArr[13] = Integer.valueOf(this.s);
                objArr[14] = Integer.valueOf(i11);
                if (obj3 == null) {
                }
                objArr[15] = obj3 == null ? str5 : str6;
                objArr[16] = obj2;
                objArr[17] = Integer.valueOf(this.s);
                objArr[18] = Integer.valueOf(i11);
                if (obj4 == null) {
                }
                objArr[19] = obj4 == null ? str5 : str6;
                objArr[20] = str2;
                if (obj4 == null) {
                }
                objArr[21] = obj4 == null ? "Xấu" : "Tốt";
                objArr[22] = str3;
                objArr[23] = Integer.valueOf(this.s);
                objArr[24] = format3;
                if (obj5 == null) {
                }
                objArr[25] = str2;
                if (obj == null) {
                }
                objArr[26] = obj == null ? str5 : str6;
                if (obj3 == null) {
                }
                objArr[27] = obj3 == null ? str5 : str6;
                if (obj4 == null) {
                }
                objArr[28] = str5;
                objArr[29] = str7;
                objArr[30] = format;
                objArr[31] = str4;
                return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p><p><ul><li>Năm sinh âm lịch: <b>%d</b> (%s)</li><li>Mệnh: %s</li><li>Năm dự kiến xây nhà: <b>%d</b> - %s - <b>%d</b> tuổi</li></ul></p><p>Việc chọn thời điểm xây nhà là vô cùng quan trọng. Khi đã chọn được vị trí tốt để xây nhà, thiết kế hướng và các yếu tố trong ngôi nhà phù hợp, thì công việc còn lại là xác định thời điểm xây nhà, tức là xác định yếu tố \"Thiên Thời\". Nếu việc lựa chọn thời điểm xây dựng, tức ngày, giờ, tháng năm tốt sẽ khiến cho Phong Thuỷ nhà ở đã tốt càng tốt hơn gấp bội, gia chủ sẽ nhanh chóng thịnh vượng, tài vận hanh thông. Ngược lại, việc chọn ngày, giờ, tháng năm xây nhà không tốt, nhất là vi phạm các cấm kỵ Phong Thuỷ thì làm giảm sự tốt đẹp của Phong Thuỷ ngôi nhà, gây suy bại và nhiều điều xấu cho gia đình.</p><p style=\"color:#ff0000;\"><b>Phân tích các yếu tố Tam Tai, Kim Lâu, Hoàng Ốc:</b></p><u>Tam tai</u>: Gia chủ tuổi <b>%s</b>, cần tránh các năm tam tai: <b>%s, %s, %s</b>. Năm dự kiến xây nhà là năm <b>%d</b> tức năm <b>%s</b>, như vậy sẽ <b>%s tam tai</b>.<p><u>Kim lâu</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s kim lâu</b>%s.</p><p><u>Hoàng ốc</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s hoàng ốc</b> vì có hoàng ốc nơi vào là cung <b>%s</b> là <b>%s</b>, %s.</p><p>Nếu cả ba yếu tố trên đều không bị phạm là tốt nhất, còn nếu phạm Tam Tai mà không phạm Kim Lâu, Hoàng Ốc thì cũng có thể chấp nhận được. Phạm vào Kim Lâu hoặc Hoàng Ốc thì tuyệt đối không nên tiến hành xây dựng, sửa chữa nhà cửa, mà nên đợi năm khác, hoặc tiến hành thủ tục mượn tuổi.</p><p>Trường hợp này, năm xây nhà là năm <b>%d</b>, tức năm <b>%s</b>, %s tiến hành xây dựng, sửa chữa nhà cửa vì tuổi của gia chủ đã <b>%s tam tai</b>, <b>%s kim lâu</b>, <b>%s hoàng ốc</b>.%s%s%s<p style=\"color:#ff0000;\"><b>Quy trình khấn lễ động thổ:</b></p><p><ul><li>Trong lễ động thổ ngày xưa phải cúng tam sinh, ngày nay đơn giản hơn, nhưng phải là con gà, đĩa xôi, hương, hoa quả, vàng mã...</li><li>Sau khi làm lễ gia chủ (hoặc người được mượn tuổi nếu có) là người cầm cuốc bổ những nhát đầu tiên, trình với Thổ thần xin được động thổ, tiếp sau đó, mới cho thợ đào.</li><li>Trước khi khấn phải thắp nén nhang vái bốn phương, tám hướng rồi quay mặt vào mâm lễ mà khấn.</li></ul></p></p></div>", objArr);
            }
            i4 = 1;
            i5 = i4;
            while (i3 < i11) {
            }
            if (i5 != 1) {
            }
            obj4 = null;
            if (obj != null) {
            }
            if (obj == null) {
            }
            if (obj5 != null) {
            }
            objArr = new Object[32];
            objArr[i6] = Integer.valueOf(this.r);
            objArr[1] = format2;
            objArr[2] = d.b;
            objArr[3] = Integer.valueOf(this.s);
            objArr[4] = format3;
            objArr[5] = Integer.valueOf(i11);
            objArr[6] = format2;
            strArr = c.b;
            objArr[7] = strArr[i9];
            objArr[8] = strArr[i];
            objArr[9] = strArr[i2];
            objArr[10] = Integer.valueOf(this.s);
            objArr[11] = format3;
            str5 = "phạm";
            str6 = "không phạm";
            if (obj == null) {
            }
            objArr[12] = obj == null ? str5 : str6;
            objArr[13] = Integer.valueOf(this.s);
            objArr[14] = Integer.valueOf(i11);
            if (obj3 == null) {
            }
            objArr[15] = obj3 == null ? str5 : str6;
            objArr[16] = obj2;
            objArr[17] = Integer.valueOf(this.s);
            objArr[18] = Integer.valueOf(i11);
            if (obj4 == null) {
            }
            objArr[19] = obj4 == null ? str5 : str6;
            objArr[20] = str2;
            if (obj4 == null) {
            }
            objArr[21] = obj4 == null ? "Xấu" : "Tốt";
            objArr[22] = str3;
            objArr[23] = Integer.valueOf(this.s);
            objArr[24] = format3;
            if (obj5 == null) {
            }
            objArr[25] = str2;
            if (obj == null) {
            }
            objArr[26] = obj == null ? str5 : str6;
            if (obj3 == null) {
            }
            objArr[27] = obj3 == null ? str5 : str6;
            if (obj4 == null) {
            }
            objArr[28] = str5;
            objArr[29] = str7;
            objArr[30] = format;
            objArr[31] = str4;
            return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p><p><ul><li>Năm sinh âm lịch: <b>%d</b> (%s)</li><li>Mệnh: %s</li><li>Năm dự kiến xây nhà: <b>%d</b> - %s - <b>%d</b> tuổi</li></ul></p><p>Việc chọn thời điểm xây nhà là vô cùng quan trọng. Khi đã chọn được vị trí tốt để xây nhà, thiết kế hướng và các yếu tố trong ngôi nhà phù hợp, thì công việc còn lại là xác định thời điểm xây nhà, tức là xác định yếu tố \"Thiên Thời\". Nếu việc lựa chọn thời điểm xây dựng, tức ngày, giờ, tháng năm tốt sẽ khiến cho Phong Thuỷ nhà ở đã tốt càng tốt hơn gấp bội, gia chủ sẽ nhanh chóng thịnh vượng, tài vận hanh thông. Ngược lại, việc chọn ngày, giờ, tháng năm xây nhà không tốt, nhất là vi phạm các cấm kỵ Phong Thuỷ thì làm giảm sự tốt đẹp của Phong Thuỷ ngôi nhà, gây suy bại và nhiều điều xấu cho gia đình.</p><p style=\"color:#ff0000;\"><b>Phân tích các yếu tố Tam Tai, Kim Lâu, Hoàng Ốc:</b></p><u>Tam tai</u>: Gia chủ tuổi <b>%s</b>, cần tránh các năm tam tai: <b>%s, %s, %s</b>. Năm dự kiến xây nhà là năm <b>%d</b> tức năm <b>%s</b>, như vậy sẽ <b>%s tam tai</b>.<p><u>Kim lâu</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s kim lâu</b>%s.</p><p><u>Hoàng ốc</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s hoàng ốc</b> vì có hoàng ốc nơi vào là cung <b>%s</b> là <b>%s</b>, %s.</p><p>Nếu cả ba yếu tố trên đều không bị phạm là tốt nhất, còn nếu phạm Tam Tai mà không phạm Kim Lâu, Hoàng Ốc thì cũng có thể chấp nhận được. Phạm vào Kim Lâu hoặc Hoàng Ốc thì tuyệt đối không nên tiến hành xây dựng, sửa chữa nhà cửa, mà nên đợi năm khác, hoặc tiến hành thủ tục mượn tuổi.</p><p>Trường hợp này, năm xây nhà là năm <b>%d</b>, tức năm <b>%s</b>, %s tiến hành xây dựng, sửa chữa nhà cửa vì tuổi của gia chủ đã <b>%s tam tai</b>, <b>%s kim lâu</b>, <b>%s hoàng ốc</b>.%s%s%s<p style=\"color:#ff0000;\"><b>Quy trình khấn lễ động thổ:</b></p><p><ul><li>Trong lễ động thổ ngày xưa phải cúng tam sinh, ngày nay đơn giản hơn, nhưng phải là con gà, đĩa xôi, hương, hoa quả, vàng mã...</li><li>Sau khi làm lễ gia chủ (hoặc người được mượn tuổi nếu có) là người cầm cuốc bổ những nhát đầu tiên, trình với Thổ thần xin được động thổ, tiếp sau đó, mới cho thợ đào.</li><li>Trước khi khấn phải thắp nén nhang vái bốn phương, tám hướng rồi quay mặt vào mâm lễ mà khấn.</li></ul></p></p></div>", objArr);
        }
        obj2 = str;
        obj3 = 1;
        i3 = i11 / 10;
        if (i3 != 1) {
        }
        i4 = 1;
        i5 = i4;
        while (i3 < i11) {
        }
        if (i5 != 1) {
        }
        obj4 = null;
        if (obj != null) {
        }
        if (obj == null) {
        }
        if (obj5 != null) {
        }
        objArr = new Object[32];
        objArr[i6] = Integer.valueOf(this.r);
        objArr[1] = format2;
        objArr[2] = d.b;
        objArr[3] = Integer.valueOf(this.s);
        objArr[4] = format3;
        objArr[5] = Integer.valueOf(i11);
        objArr[6] = format2;
        strArr = c.b;
        objArr[7] = strArr[i9];
        objArr[8] = strArr[i];
        objArr[9] = strArr[i2];
        objArr[10] = Integer.valueOf(this.s);
        objArr[11] = format3;
        str5 = "phạm";
        str6 = "không phạm";
        if (obj == null) {
        }
        objArr[12] = obj == null ? str5 : str6;
        objArr[13] = Integer.valueOf(this.s);
        objArr[14] = Integer.valueOf(i11);
        if (obj3 == null) {
        }
        objArr[15] = obj3 == null ? str5 : str6;
        objArr[16] = obj2;
        objArr[17] = Integer.valueOf(this.s);
        objArr[18] = Integer.valueOf(i11);
        if (obj4 == null) {
        }
        objArr[19] = obj4 == null ? str5 : str6;
        objArr[20] = str2;
        if (obj4 == null) {
        }
        objArr[21] = obj4 == null ? "Xấu" : "Tốt";
        objArr[22] = str3;
        objArr[23] = Integer.valueOf(this.s);
        objArr[24] = format3;
        if (obj5 == null) {
        }
        objArr[25] = str2;
        if (obj == null) {
        }
        objArr[26] = obj == null ? str5 : str6;
        if (obj3 == null) {
        }
        objArr[27] = obj3 == null ? str5 : str6;
        if (obj4 == null) {
        }
        objArr[28] = str5;
        objArr[29] = str7;
        objArr[30] = format;
        objArr[31] = str4;
        return String.format("<div style=\"text-align:justify;color:#292927;\"><p style=\"color:#ff0000;\"><b>Thông tin gia chủ:</b></p><p><ul><li>Năm sinh âm lịch: <b>%d</b> (%s)</li><li>Mệnh: %s</li><li>Năm dự kiến xây nhà: <b>%d</b> - %s - <b>%d</b> tuổi</li></ul></p><p>Việc chọn thời điểm xây nhà là vô cùng quan trọng. Khi đã chọn được vị trí tốt để xây nhà, thiết kế hướng và các yếu tố trong ngôi nhà phù hợp, thì công việc còn lại là xác định thời điểm xây nhà, tức là xác định yếu tố \"Thiên Thời\". Nếu việc lựa chọn thời điểm xây dựng, tức ngày, giờ, tháng năm tốt sẽ khiến cho Phong Thuỷ nhà ở đã tốt càng tốt hơn gấp bội, gia chủ sẽ nhanh chóng thịnh vượng, tài vận hanh thông. Ngược lại, việc chọn ngày, giờ, tháng năm xây nhà không tốt, nhất là vi phạm các cấm kỵ Phong Thuỷ thì làm giảm sự tốt đẹp của Phong Thuỷ ngôi nhà, gây suy bại và nhiều điều xấu cho gia đình.</p><p style=\"color:#ff0000;\"><b>Phân tích các yếu tố Tam Tai, Kim Lâu, Hoàng Ốc:</b></p><u>Tam tai</u>: Gia chủ tuổi <b>%s</b>, cần tránh các năm tam tai: <b>%s, %s, %s</b>. Năm dự kiến xây nhà là năm <b>%d</b> tức năm <b>%s</b>, như vậy sẽ <b>%s tam tai</b>.<p><u>Kim lâu</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s kim lâu</b>%s.</p><p><u>Hoàng ốc</u>: Năm <b>%d</b>, gia chủ <b>%d</b> tuổi (tuổi âm), nếu năm đó tiến hành xây nhà sẽ <b>%s hoàng ốc</b> vì có hoàng ốc nơi vào là cung <b>%s</b> là <b>%s</b>, %s.</p><p>Nếu cả ba yếu tố trên đều không bị phạm là tốt nhất, còn nếu phạm Tam Tai mà không phạm Kim Lâu, Hoàng Ốc thì cũng có thể chấp nhận được. Phạm vào Kim Lâu hoặc Hoàng Ốc thì tuyệt đối không nên tiến hành xây dựng, sửa chữa nhà cửa, mà nên đợi năm khác, hoặc tiến hành thủ tục mượn tuổi.</p><p>Trường hợp này, năm xây nhà là năm <b>%d</b>, tức năm <b>%s</b>, %s tiến hành xây dựng, sửa chữa nhà cửa vì tuổi của gia chủ đã <b>%s tam tai</b>, <b>%s kim lâu</b>, <b>%s hoàng ốc</b>.%s%s%s<p style=\"color:#ff0000;\"><b>Quy trình khấn lễ động thổ:</b></p><p><ul><li>Trong lễ động thổ ngày xưa phải cúng tam sinh, ngày nay đơn giản hơn, nhưng phải là con gà, đĩa xôi, hương, hoa quả, vàng mã...</li><li>Sau khi làm lễ gia chủ (hoặc người được mượn tuổi nếu có) là người cầm cuốc bổ những nhát đầu tiên, trình với Thổ thần xin được động thổ, tiếp sau đó, mới cho thợ đào.</li><li>Trước khi khấn phải thắp nén nhang vái bốn phương, tám hướng rồi quay mặt vào mâm lễ mà khấn.</li></ul></p></p></div>", objArr);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void s() {
        String str = "%s%s%s";
        String str2;
        if ("TAG_XEMHUONGNHA".equals(this.n)) {
            str2 = "file:///android_asset/8VongBatQuai/";
            this.o.loadDataWithBaseURL(str2, String.format(str, new Object[]{this.p, q(), this.q}), "text/html", "UTF-8", null);
        } else {
            if ("TAG_XEMTUOI_XAYNHA".equals(this.n)) {
                str2 = "file:///android_asset/";
                this.o.loadDataWithBaseURL(str2, String.format(str, new Object[]{this.p, r(), this.q}), "text/html", "UTF-8", null);
            }
        }
        this.o.setWebViewClient(new a(this));
    }

    private void t() {
        if (getIntent().getExtras() != null) {
            this.n = getIntent().getStringExtra("EXTRA_TAG");
            if ("TAG_XEMHUONGNHA".equals(this.n)) {
                this.r = getIntent().getIntExtra("TAG_XEMHUONGNHA_NAMSINH", 0);
                this.t = getIntent().getIntExtra("TAG_XEMHUONGNHA_HUONGNHA", 0);
                this.u = getIntent().getIntExtra("TAG_XEMHUONGNHA_GIOITINH", 0);
                return;
            }
            if ("TAG_XEMTUOI_XAYNHA".equals(this.n)) {
                this.r = getIntent().getIntExtra("TAG_XETUOI_NAMSINH", 0);
                this.s = getIntent().getIntExtra("TAG_XEMTUOI_NAMDUKIEN", 0);
            }
        }
    }

    private void u() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void v() {
        if ("TAG_XEMHUONGNHA".equals(this.n)) {
            a(R.drawable.btn_back_2, "KẾT QUẢ HƯỚNG NHÀ", 0);
        } else {
            if ("TAG_XEMTUOI_XAYNHA".equals(this.n)) {
                a(R.drawable.btn_back_2, "KẾT QUẢ BÌNH GIẢI", 0);
            } else {
                a(R.drawable.btn_back_2, "", 0);
            }
        }
        this.o = (WebView) findViewById(R.id.webView);
        this.o.setBackgroundColor(Color.argb(1, 0, 0, 0));
        this.p = "<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNBaiSau_R_0.TTF\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNBaiSau.TTF\");}*{-webkit-user-select:none}body{font-family:MyFont;text-align:justify;padding:3px 5px;color:#2f2f2d;} b{font-family:MyFontBold;}</style></head><body>";
        this.q = "</body></html>";
        this.o.getSettings().setCacheMode(2);
        this.o.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.o.setHapticFeedbackEnabled(false);
        this.o.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_webview_giaithich);
        t();
        v();
        s();
        u();
        j();
    }
}
