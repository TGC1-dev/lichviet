package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "qid", name = "QueQuanAm")
public class QueQuanAm extends Model implements Serializable {
    @Column(name = "qname")
    public String a;
    @Column(name = "qdescription")
    public String b;
    @Column(name = "qcontent")
    public String c;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
