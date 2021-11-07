package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "sid", name = "Sao")
public class Sao extends Model implements Serializable {
    @Column(name = "sid")
    public long a;
    @Column(name = "sname")
    public String b;
    @Column(name = "stime")
    public String c;
    @Column(name = "stongquan")
    public String d;
    @Column(name = "snam")
    public String e;
    @Column(name = "snu")
    public String f;
    @Column(name = "stomtat")
    public String g;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
