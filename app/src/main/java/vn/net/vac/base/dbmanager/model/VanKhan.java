package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "vid", name = "VanKhan")
public class VanKhan extends Model implements Serializable {
    @Column(name = "vname")
    public String a;
    @Column(name = "vcontent")
    public String b;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
