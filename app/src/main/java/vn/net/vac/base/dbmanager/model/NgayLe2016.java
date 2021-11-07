package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "nid", name = "NgayLe2020")
public class NgayLe2016 extends Model implements Serializable {
    @Column(name = "nid")
    public long a;
    @Column(name = "ntime")
    public String b;
    @Column(name = "ndescription")
    public String c;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Time: ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
