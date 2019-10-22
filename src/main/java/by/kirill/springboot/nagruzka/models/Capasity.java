package by.kirill.springboot.nagruzka.models;

import javax.persistence.*;

@Entity
public class Capasity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    private long po_uch_pl;
    private long s_uchetom_sn;
    private long teor_obuch;
    private long prakt_obuch;
    private long lab_rab;
    private long kurs_pr;
    private long priem_kurs_pr;
    private long priem_ekz;
    private long kons_1sem;
    private long kons_2sem;
    private long prov_DKR_1sem;
    private long prov_DKR_2sem;
    private long kol_OKR;
    private long ned_nagr_1sem;
    private long obch_nagr_1sem;
    private long ned_nagr_2sem;
    private long obch_nagr_2sem;
    private long vsego_ch_na_god;
    private String itog_at;

    public long getId() {
        return id;
    }

    public long getPo_uch_pl() {
        return po_uch_pl;
    }

    public void setPo_uch_pl(long po_uch_pl) {
        this.po_uch_pl = po_uch_pl;
    }

    public long getS_uchetom_sn() {
        return s_uchetom_sn;
    }

    public void setS_uchetom_sn(long s_uchetom_sn) {
        this.s_uchetom_sn = s_uchetom_sn;
    }

    public long getTeor_obuch() {
        return teor_obuch;
    }

    public void setTeor_obuch(long teor_obuch) {
        this.teor_obuch = teor_obuch;
    }

    public long getPrakt_obuch() {
        return prakt_obuch;
    }

    public void setPrakt_obuch(long prakt_obuch) {
        this.prakt_obuch = prakt_obuch;
    }

    public long getLab_rab() {
        return lab_rab;
    }

    public void setLab_rab(long lab_rab) {
        this.lab_rab = lab_rab;
    }

    public long getKurs_pr() {
        return kurs_pr;
    }

    public void setKurs_pr(long kurs_pr) {
        this.kurs_pr = kurs_pr;
    }

    public long getPriem_kurs_pr() {
        return priem_kurs_pr;
    }

    public void setPriem_kurs_pr(long priem_kurs_pr) {
        this.priem_kurs_pr = priem_kurs_pr;
    }

    public long getPriem_ekz() {
        return priem_ekz;
    }

    public void setPriem_ekz(long priem_ekz) {
        this.priem_ekz = priem_ekz;
    }

    public long getKons_1sem() {
        return kons_1sem;
    }

    public void setKons_1sem(long kons_1sem) {
        this.kons_1sem = kons_1sem;
    }

    public long getKons_2sem() {
        return kons_2sem;
    }

    public void setKons_2sem(long kons_2sem) {
        this.kons_2sem = kons_2sem;
    }

    public long getProv_DKR_1sem() {
        return prov_DKR_1sem;
    }

    public void setProv_DKR_1sem(long prov_DKR_1sem) {
        this.prov_DKR_1sem = prov_DKR_1sem;
    }

    public long getProv_DKR_2sem() {
        return prov_DKR_2sem;
    }

    public void setProv_DKR_2sem(long prov_DKR_2sem) {
        this.prov_DKR_2sem = prov_DKR_2sem;
    }

    public long getKol_OKR() {
        return kol_OKR;
    }

    public void setKol_OKR(long kol_OKR) {
        this.kol_OKR = kol_OKR;
    }

    public long getNed_nagr_1sem() {
        return ned_nagr_1sem;
    }

    public void setNed_nagr_1sem(long ned_nagr_1sem) {
        this.ned_nagr_1sem = ned_nagr_1sem;
    }

    public long getObch_nagr_1sem() {
        return obch_nagr_1sem;
    }

    public void setObch_nagr_1sem(long obch_nagr_1sem) {
        this.obch_nagr_1sem = obch_nagr_1sem;
    }

    public long getNed_nagr_2sem() {
        return ned_nagr_2sem;
    }

    public void setNed_nagr_2sem(long ned_nagr_2sem) {
        this.ned_nagr_2sem = ned_nagr_2sem;
    }

    public long getObch_nagr_2sem() {
        return obch_nagr_2sem;
    }

    public void setObch_nagr_2sem(long obch_nagr_2sem) {
        this.obch_nagr_2sem = obch_nagr_2sem;
    }

    public long getVsego_ch_na_god() {
        return vsego_ch_na_god;
    }

    public void setVsego_ch_na_god(long vsego_ch_na_god) {
        this.vsego_ch_na_god = vsego_ch_na_god;
    }

    public String getItog_at() {
        return itog_at;
    }

    public void setItog_at(String itog_at) {
        this.itog_at = itog_at;
    }

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    Teacher teacher;

    @ManyToOne
    @JoinColumn(name="subject_id")
    Subject subject;

    @ManyToOne
    @JoinColumn(name = "grp_id")
    Grp grp;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Grp getGrp() {
        return grp;
    }

    public void setGrp(Grp grp) {
        this.grp = grp;
    }
}
