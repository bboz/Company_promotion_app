package com.example.baris.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    // görüntülerin listesi
    public int[] lst_images={
            R.drawable.ce_50_sg,
            R.drawable.te_50,
            R.drawable.ke_50,
            R.drawable.ge_50_icv
    };

    // başlıkların listesi
    public String[] lst_title={
            "CE 50 SG\n"+"Teknik Özellikleri",
            "TE 50\n"+"Teknik Özellikleri",
            "KE 50\n"+"Teknik Özellikleri",
            "GE 50 ICV\n"+"Teknik Özellikleri"
    };

    // açıklamaların listesi
    public String[] lst_description={
            "● Yeni ön camlama tekniği,\n" +
                    "● 50 mm gövde genişliği,\n" +
                    "● Dışa açılan ters vasistas gizli kanat uygulaması ile havalandırma seçeneği,\n" +
                    "● 1.6, 2 ve 3 mm et kalınlığına sahip alüminyum profiller,\n" +
                    "● Tüm Ral renklerinde ve eloksal seçeneklerinde,\n" +
                    "● QUALANOD ve QUALICOAT belgeli profil üretimi, ahşap görünümlü profil seçeneği,\n" +
                    "● EPDM hava, su ve toz sızdırmazlık fitilleri,\n" +
                    "● Başarı ile tamamlanan KAPEDAM performans testleri",
            "● Sistem her iki yönden kapaklı uygulanabileceği gibi, semi strüktürel silikon birleşimli uygulamaya da izin verir.\n" +
                    "● Köşe ve açılı birleşimlere izin veren serbest hareketli boyun tasarımlı profiller sayesinde ışıklık mahya ya da köşe dönüşleri rahatlıkla ayarlanabilir.\n" +
                    "● Profil gövdeleri çelik veya alüminyum taşıyıcı konstrüksiyona rahatlıkla oturabilecek şekilde tasarlanmıştır.\n" +
                    "● Orta ölçekli ışıklıklar için uygun çözümler sunar.\n" +
                    "● TE50, Sistem E50 cephe sisteminden geliştirilmiş bir seri olduğu için cephe ve ışıklık birleşimleriyle rahatlıkla birleşim sağlar ve kış bahçelerine de uygun bir çözüm olarak ortaya çıkar.\n" +
                    "● Derin kondens ve terleme kanallı profiller ışıklık sistemleri için mükemmel çözümler üretmeniz için idealdir.",
            "● 50 mm gövde genişliği,\n" +
                    "● İlave edilecek doğrama sistemleriyle tek, çift ya da vasistas uygulamaları,\n" +
                    "● Dışa açılan gizli kanat uygulaması ile havalandırma seçeneği,\n" +
                    "● 1.6, 2 ve 3 mm et kalınlığına sahip alüminyum profiller,\n" +
                    "● Tüm Ral renklerinde ve eloksal seçeneklerinde QUALANOD ve QUALICOAT belgeli profil üretimi,\n" +
                    "● EPDM hava, su ve toz sızdırmazlık fitilleri,\n" +
                    "● Başarı ile tamamlanan performans testleri",
            "● 50 mm gövde genişliği,\n" +
                    "● Dışardan algılanmayan içe açılır gizli kanat,\n" +
                    "● 1.6, 2 ve 3 mm et kalınlıklarına sahip alüminyum profiller,\n" +
                    "● %25 cam elyaf takviyeli Çuhadaroğlu baskılı polyamid (ithal) ısı bariyer kullanımı,\n" +
                    "● Tüm ral renklerinde ve eloksal seçeneklerinde QUALANOD ve QUALICOAT belgeli profil üretimi,\n" +
                    "● EPDM ve silikon hava, su ve toz sızdırmazlık fitilleri,\n" +
                    "● Başarı ile tamamlanan KAPEDAM performans testleri"
    };

    // arkaplan renk listesi
    public int[] lst_backgroundcolor={
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255)
    };

    public SlideAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide=(LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView txtdescription = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        txtdescription.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
