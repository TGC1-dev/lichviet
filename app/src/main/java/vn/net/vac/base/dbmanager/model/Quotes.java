package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "qid", name = "Quotes")
public class Quotes extends Model implements Serializable {
    @Column(name = "qcontent")
    public String a;
    @Column(name = "qauthor")
    public String b;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Content: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
