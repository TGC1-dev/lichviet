package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "vid", name = "VanKhanType")
public class VanKhanType extends Model implements Serializable {
    @Column(name = "vid")
    public int a;
    @Column(name = "vname")
    public String b;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
