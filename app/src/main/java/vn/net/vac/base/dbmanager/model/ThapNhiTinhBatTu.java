package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "t_id", name = "ThapNhiTinhBatTu")
public class ThapNhiTinhBatTu extends Model implements Serializable {
    @Column(name = "t_name")
    public String a;
    @Column(name = "t_content")
    public String b;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
