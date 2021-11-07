package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "xid", name = "XemBoi")
public class XemBoi extends Model implements Serializable {
    @Column(name = "xname")
    public String a;
    @Column(name = "xdescription")
    public String b;
    @Column(name = "xcontent")
    public String c;
    @Column(name = "xthumb")
    public String d;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
