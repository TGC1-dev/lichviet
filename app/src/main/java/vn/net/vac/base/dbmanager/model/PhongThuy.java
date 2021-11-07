package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "pid", name = "PhongThuy")
public class PhongThuy extends Model implements Serializable {
    @Column(name = "pname")
    public String a;
    @Column(name = "pdescription")
    public String b;
    @Column(name = "pthumb")
    public String c;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
