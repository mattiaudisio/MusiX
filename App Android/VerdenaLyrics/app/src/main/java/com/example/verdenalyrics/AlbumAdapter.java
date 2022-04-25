package com.example.verdenalyrics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.MyViewHolder>{

    public ArrayList<Album> arrayCanzoni;
    Context mContext;
    LayoutInflater inflater;

    public AlbumAdapter(Context mContext, ArrayList<Album> arrayCanzoni) {
        this.arrayCanzoni = arrayCanzoni;
        this.mContext = mContext;
        this.inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public AlbumAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.element_album,parent,false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AlbumAdapter.MyViewHolder holder, int position) {
        holder.nomeAlbum.setText(arrayCanzoni.get(position).getAlbum());
        holder.tipoAlbum.setText(arrayCanzoni.get(position).getTipo() + " | " + arrayCanzoni.get(position).getData());
        holder.imgAlbum.setImageResource(arrayCanzoni.get(position).getAlbumPhoto());
    }

    @Override
    public int getItemCount() {
        return arrayCanzoni.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView nomeAlbum,tipoAlbum;
        ImageView imgAlbum;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAlbum = itemView.findViewById(R.id.imgAlbum);
            nomeAlbum = itemView.findViewById(R.id.albumNome);
            tipoAlbum = itemView.findViewById(R.id.tipoAlbumAnno);
            ArrayList<Canzone> arrayCanzoni = new ArrayList<>();
            itemView.setOnClickListener(v -> {
                switch (getAdapterPosition()){
                    case 0:
                        arrayCanzoni.add(new Canzone("Took your name","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Valium","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("DMS 10","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Froggs Eggs","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Across","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Stinky Louse","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("High Heart Corporation","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Wonder","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Leasy Creep","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Porno Dolls Rubber","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Velvet","Lyrics for this song have yet to be released"));
                        break;
                    case 1:
                        arrayCanzoni.add(new Canzone("Fuxia","Eroina fertile\nVincerai tu\nSuicida isterico\nDove sei?\nCurami\nCurami\nAdesso no\n\nIo che non so\nPiù dove andrò\nPure se vuoi\nMa io non lo so\nDove sei\n\nVoglio e posso perdere\nVincerai tu\nSangue in seno voli via\nLavami lì\nCurami\nCurami\nAncora un pò\n\nIo che non so\nPiù dove andrò\nPure se puoi\nMa io non lo so\nNon lo so\nNon lo so\n\nDove sei (x17)"));
                        arrayCanzoni.add(new Canzone("Fiato Adolescenziale","Eh, scimmie, non mi frega vivere\nSucchiandomi, io non devo esigere\n" +
                                "Carne, bamboline stitiche\nCullandomi, io non devo esigere\n" +
                                "Guardami come sei\nIo non so più perdere\n" +
                                "Guardami come puoi\n" +
                                "Io amavo le mie\n" +
                                "Scimmie, grandi mani su di me\n" +
                                "Mangimi, crollo e penso solo a me\n" +
                                "Guardami come sei\n" +
                                "Io non so più perdere\n" +
                                "Guardami come puoi\n" +
                                "Io non so più perdere\n" +
                                "Eh\n" +
                                "Dovrei, fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Uh, uhuh, la la\n" +
                                "Eh, ihih, la la\n" +
                                "Uh, uhuh, lala, mi\n" +
                                "Scimmie, non mi frega vivere\n" +
                                "Succhiandomi, io non devo esigere\n" +
                                "Carne, bamboline stitiche\n" +
                                "Cullandomi, io non devo ridere\n" +
                                "Guardami come sei\n" +
                                "Io non so più perdere\n" +
                                "Guardami come puoi\n" +
                                "Io non so più perdere\n" +
                                "Eh\n" +
                                "Ehi, fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Uh, uhuh, la la\n" +
                                "Eh, ihih, la la\n" +
                                "Uh, uhuh, lala, mi\n"));
                        arrayCanzoni.add(new Canzone("Nella Schiuma","Come vuoi starò fuori e dentro me\n" +
                                "Puoi convincere le mie labbra perdersi\n" +
                                "Le mie labbra perdersi\n" +
                                "Rose lesbiche posso credere\n" +
                                "Rubi ma non sei carne giovane\n" +
                                "Come vuoi sarò l'ombra dei miei guai\n" +
                                "Fiori in foglie e poi scopi labbra e fiori blu\n" +
                                "Scopi labbra e fiori blu\n" +
                                "Rose lesbiche posso credere\n" +
                                "Rubi ma non sei carne giovane\n" +
                                "Verbena (x8)"));
                        arrayCanzoni.add(new Canzone("Zoe","Io non dormo mai\n" +
                                "Dormo in me\n" +
                                "Scuse solide\n" +
                                "La mia immagine\n" +
                                "Non sono io\n" +
                                "Sento ridere\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Io non dormo mai\n" +
                                "E so\n" +
                                "Scuse ruvide\n" +
                                "La mia vanità\n" +
                                "Non sono io\n" +
                                "Sento ridere\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Su di te\n" +
                                "Te\n" +
                                "Te\n" +
                                "Te"));
                        arrayCanzoni.add(new Canzone("Bambina In Nero","Lei si consuma su di me\n" +
                                "Lei si nasconde ma non so dov'è\n" +
                                "Con le tue ali in coma stai\n" +
                                "Lei non ha tempo Io non so perché\n" +
                                "Perché\n" +
                                "\n" +
                                "E tu sei sola\n" +
                                "E tu sei sola\n" +
                                "\n" +
                                "Lei si consuma su di me\n" +
                                "Lei si consuma lenta dentro me\n" +
                                "Con le tue mani in coma stai\n" +
                                "Lei non ha tempo io non so perché\n" +
                                "Perché\n" +
                                "\n" +
                                "E tu sei sola\n" +
                                "E tu sei sola\n" +
                                "Tu sei sola\n" +
                                "E tu sei sola"));
                        arrayCanzoni.add(new Canzone("Mormorio mucoso","Come sai puoi vincere\n" +
                                "Così guardami so fingere\n" +
                                "Come sai non ho fame\n" +
                                "Come vuoi lo so non fa male\n" +
                                "\n" +
                                "Guardami puoi fendere\n" +
                                "Voli dentro me so fingere\n" +
                                "Come sai non ho fame\n" +
                                "Come vuoi lo so non fa male\n" +
                                "\n" +
                                "Come sai non ho fame\n" +
                                "Come vuoi lo so non fa male\n" +
                                "Come sai qui sto bene\n" +
                                "Legami se vuoi non fa male\n"));
                        arrayCanzoni.add(new Canzone("Memo Box","Occhi neri tremano... dove andrò?\n" +
                                "Labbra in culo chiamami... ti troverò!\n" +
                                "Troverò ahh\n" +
                                "\n" +
                                "Padre infanga l'anima... vado via\n" +
                                "Cerco, soffro e muoio io... madre mia\n" +
                                "\n" +
                                "Dimmi che x3\n" +
                                "Dimmi che non hai paura\n" +
                                "Come me\n" +
                                "Dimmi che\n" +
                                "Dimmi che non hai paura\n" +
                                "\n" +
                                "Pauraa ahhh\n" +
                                "\n" +
                                "Cielo in freddo coprimi... dove sei?\n" +
                                "La bocca è calda baciami\n" +
                                "Morirei\n" +
                                "\n" +
                                "Dimmi che x3\n" +
                                "Dimmi che non hai paura\n" +
                                "Come me\n" +
                                "Dimmi che\n" +
                                "Dimmi che non hai paura\n" +
                                "\n" +
                                "WWWAAAAAAAA\n" +
                                "WWWAAAAAAAA\n" +
                                "WWAAAAAAA\n" +
                                "Dimmi che x3\n" +
                                "Dimmi che non hai paura\n" +
                                "Come me\n" +
                                "Dimmi che\n" +
                                "Dimmi che non hai paura\n" +
                                "\n" +
                                "Pauraa ahhhua"));
                        arrayCanzoni.add(new Canzone("Sara","Sara, le tue lacrime sono nuvole\n" +
                                "Oh no le tue rughe sai sono lacrime\n" +
                                "Ah-ha, sono fuori ma, ma perchè vai là?\n" +
                                "Oh no tu puoi dirmelo sono inutile\n" +
                                "\n" +
                                "Tu mi spegni\n" +
                                "E nuda bevi, tu\n" +
                                "Tu mi spremi\n" +
                                "E nuda bevi, tu\n" +
                                "\n" +
                                "Tu sei, solo tu non sei\n" +
                                "Tu sei l'unica\n" +
                                "Spari tuoni di su di me siano come sai\n" +
                                "\n" +
                                "Tu mi spegni\n" +
                                "E nuda bevi, tu\n" +
                                "Tu mi spremi\n" +
                                "E nuda bevi, tu\n" +
                                "\n" +
                                "Tu mi spegni\n" +
                                "E nuda bevi, tu\n" +
                                "Tu mi spremi\n" +
                                "E nuda bevi, tu"));
                        arrayCanzoni.add(new Canzone("Bevimi","Fuori piove e poi il culo è vergine\n" +
                                "Fuori piove ma so chi sei\n" +
                                "Seno fragile, tu il crimine\n" +
                                "Fuori piove ma so chi sei!\n" +
                                "\n" +
                                "Oh no, oh no, oh no\n" +
                                "Oh no, oh no, oh no\n" +
                                "Bevimi, so chi sei\n" +
                                "Bevimi, so chi sei\n" +
                                "\n" +
                                "Padri vigili, culle simili\n" +
                                "Fuori piove ma so chi sei\n" +
                                "Muore l'argine, brucia bene in me\n" +
                                "Fuori piove ma so chi sei\n" +
                                "\n" +
                                "Oh no, oh no, oh no\n" +
                                "Oh no, oh no, oh no\n" +
                                "Bevimi, so chi sei\n" +
                                "Bevimi, so chi sei"));
                        arrayCanzoni.add(new Canzone("Blu Ninive","Io qui vincibile, ma tu sei qui\n" +
                                "Con me in lacrime, inculami\n" +
                                "Ah yeah!\n" +
                                "\n" +
                                "In me non credo che, più giù oh sì\n" +
                                "Oh no, non crescere, inculami\n" +
                                "\n" +
                                "No tu non puoi\n" +
                                "Mi lasci e poi vai\n" +
                                "Waah! Yeah!\n" +
                                "\n" +
                                "Io qui vincibile, ma tu sei qui\n" +
                                "Con me in lacrime, inculami\n" +
                                "\n" +
                                "No tu non puoi\n" +
                                "Mi lasci e poi vai\n" +
                                "Waah! Yeah!\n" +
                                "Ah yeah!"));
                        arrayCanzoni.add(new Canzone("Omnia 2241","[Strumentale]"));
                        break;
                    case 2:
                        arrayCanzoni.add(new Canzone("Valvonauta","Mi affogherei\n" +
                                "E anche se non mi viene\n" +
                                "Io senza lei\n" +
                                "E anche se non c'è miele\n" +
                                "Mi viene dolce\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Io senza lei\n" +
                                "Riesco appena a sentire\n" +
                                "Che non ci sei\n" +
                                "E riesco appena a stupirmi\n" +
                                "Va tutto bene\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai, mai\n" +
                                "\n" +
                                "Mi affogherei\n" +
                                "E anche se non conviene\n" +
                                "Io senza lei\n" +
                                "E anche se non c'è miele\n" +
                                "Mi viene dolce\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai, mai"));
                        arrayCanzoni.add(new Canzone("Dentro Sharon","Tremi un pò\n" +
                                "E non è facile\n" +
                                "Urlare nei rumori tuoi\n" +
                                "Per te\n" +
                                "Dentro Sharon\n" +
                                "Nell'immagine\n" +
                                "Perdo spesso un po' di me\n" +
                                "In te\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione\n" +
                                "\n" +
                                "Già da un pò\n" +
                                "Sono agli ordini\n" +
                                "I tuoi occhi su di me\n" +
                                "Oh no\n" +
                                "Dentro Sharon\n" +
                                "Nell'immagine\n" +
                                "Fuori il mondo grida e qui\n" +
                                "Io e te\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione\n" +
                                "\n" +
                                "Shaaa... Sharon\n" +
                                "Shaaa... Sharon...\n" +
                                "Shaaa... Sharon\n" +
                                "Shaaa... Sharon\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione...\n" +
                                "Confusione..."));
                        arrayCanzoni.add(new Canzone("Bonne Nouvelle","Ora che... ora... ti senti ok\n" +
                                "Un grido in più\n" +
                                "E poi tu... non ci sei più\n" +
                                "Se vuoi mi annego\n" +
                                "Ti senti ok\n" +
                                "Un giro intorno\n" +
                                "Non ci sei più... più!\n" +
                                "Aaaahh\n" +
                                "Aaaahh\n" +
                                "\n" +
                                "Un'ora in più... un'ora... mi sento ok\n" +
                                "Affondo giù\n" +
                                "Ebbene, non ci sei più\n" +
                                "E mi comprime\n" +
                                "E sento che\n" +
                                "Va così bene\n" +
                                "Mi sento ok\n" +
                                "\n" +
                                "Non c'è più limite\n" +
                                "Mi sento scemo e non vorrei\n" +
                                "Doverci rider su\n" +
                                "Mi sento strano e non vorrei\n" +
                                "\n" +
                                "Ora che... ora... ti senti ok\n" +
                                "Un grido in più\n" +
                                "E poi tu... non ci sei più\n" +
                                "Se vuoi mi annego\n" +
                                "Ti senti ok\n" +
                                "Un giro intorno\n" +
                                "Non ci sei più... più!\n" +
                                "\n" +
                                "Non c'è più limite\n" +
                                "\n" +
                                "Mi sento scemo e non vorrei\n" +
                                "\n" +
                                "Doverci rider su...\n" +
                                "\n" +
                                "Mi sento strano e non vorrei\n" +
                                "\n" +
                                "Ok... ok... ok... ok"));
                        arrayCanzoni.add(new Canzone("Piuma","Non c'è più un'immagine\n" +
                                "Ma sento che la vorrei con me\n" +
                                "Lo sai che c'è\n" +
                                "Io penso che ci riuscirei\n" +
                                "Qualcuno dentro i sensi miei\n" +
                                "Qualcosa che si posa in fondo dentro me\n" +
                                "Dentro non c'è\n" +
                                "Io sento lei\n" +
                                "Poi affondo nel vuoto\n" +
                                "Che io giuro che c'è\n" +
                                "Penso come sei e a come tutto urla in te\n" +
                                "Il sommergibile\n" +
                                "Io giuro lo vorrei\n" +
                                "Il vuoto dentro i sensi miei\n" +
                                "E sento che\n" +
                                "Sei tutto quello che vorrei\n" +
                                "Che vorrei\n" +
                                "Mi sento invincibile\n" +
                                "E sento che ti vorrei con me\n" +
                                "Lo sai che puoi\n" +
                                "Io penso che ci riuscirei\n" +
                                "Qualcuno dentro i sensi miei\n" +
                                "Qualcosa che si posa infondo dentro me\n" +
                                "Dentro me\n" +
                                "Dentro me\n" +
                                "Dentro me\n" +
                                "Dentro me\n" +
                                "Dentro me\n"));
                        break;
                    case 3:
                        arrayCanzoni.add(new Canzone("Ovunque","È buio ormai\n" +
                                "Non mi frega se piangi o no ooh\n" +
                                "Io come te\n" +
                                "Confusione\n" +
                                "Ora lo so\n" +
                                "Non mi sento più bene da un pò\n" +
                                "Quello che fai non mi basta mai\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque\n" +
                                "\n" +
                                "Mi spazzi via\n" +
                                "E mi vedo volare lontano\n" +
                                "Che male fa\n" +
                                "Rivedermi in me\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque\n" +
                                "\n" +
                                "È buio ormai...\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque"));
                        arrayCanzoni.add(new Canzone("Valvonauta","Mi affogherei\n" +
                                "E anche se non mi viene\n" +
                                "Io senza lei\n" +
                                "E anche se non c'è miele\n" +
                                "Mi viene dolce\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Io senza lei\n" +
                                "Riesco appena a sentire\n" +
                                "Che non ci sei\n" +
                                "E riesco appena a stupirmi\n" +
                                "Va tutto bene\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai, mai\n" +
                                "\n" +
                                "Mi affogherei\n" +
                                "E anche se non conviene\n" +
                                "Io senza lei\n" +
                                "E anche se non c'è miele\n" +
                                "Mi viene dolce\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai, mai"));
                        arrayCanzoni.add(new Canzone("Pixel","No io non so com'è\n" +
                                "Ma mi sembra inutile\n" +
                                "Dirti di più perché\n" +
                                "Non ci sei\n" +
                                "Non ci sei\n" +
                                "Ora non sei più che mai\n" +
                                "Una visione semplice\n" +
                                "Vorrei di più perché\n" +
                                "Non ci sei\n" +
                                "\n" +
                                "Io tremo con lei\n" +
                                "Forse ci sei\n" +
                                "Io vorrei di più\n" +
                                "Un po' di lei\n" +
                                "Dio contro di me\n" +
                                "È come vorrei\n" +
                                "Sfiorarti di più... aaaah\n" +
                                "\n" +
                                "Non so supersfogo che non c'è\n" +
                                "Lo so cosa qui c'è che non c'è\n" +
                                "Non so supersfogo che non c'è\n" +
                                "Lo so cosa qui c'è che non c'è\n" +
                                "\n" +
                                "Io tremo con lei\n" +
                                "Forse ci sei\n" +
                                "Io vorrei di più\n" +
                                "Un po' di lei\n" +
                                "Dio contro di me\n" +
                                "È come vorrei\n" +
                                "Sfiorarti di più..."));
                        arrayCanzoni.add(new Canzone("L’infinita Gioia Di Henry Bahus","Io non ti avrò mai\n" +
                                "Ma sento che c'è\n" +
                                "Mi sfiori\n" +
                                "Mi sento lontano come non mai\n" +
                                "Nei miei neri e blu non mi sembra di trovarti mai\n" +
                                "Ora sento che io dovrei lei vomitare\n" +
                                "\n" +
                                "Qualcosa non va\n" +
                                "Qualcosa in me\n" +
                                "E sudi\n" +
                                "Mi vedo all'inverso come non mai\n" +
                                "Nei miei neri e blu non mi sembra di trovarti mai\n" +
                                "Ora bevo in lei e mi sento più speciale\n" +
                                "\n" +
                                "E dentro me\n" +
                                "E dentro me\n" +
                                "Io come lei\n" +
                                "E dentro me\n" +
                                "E dentro me\n" +
                                "Io come lei\n" +
                                "\n" +
                                "Qualcosa non va qualcosa in me\n" +
                                "E sudi\n" +
                                "\n" +
                                "Io non ti avrò mai\n" +
                                "Ma sento che c'è\n" +
                                "Mi sfiori\n" +
                                "Mi sento lontano come non mai\n" +
                                "Nei miei neri e blu non mi sembra di trovarti mai\n" +
                                "Ora sento che io dovrei lei vomitare\n" +
                                "\n" +
                                "E dentro me\n" +
                                "E dentro me\n" +
                                "Io come lei\n" +
                                "E dentro me\n" +
                                "E dentro me\n" +
                                "Io come lei"));
                        arrayCanzoni.add(new Canzone("Vera","Vera dormi un pò\n" +
                                "Ma non sei così\n" +
                                "Dolce come sei\n" +
                                "Vera tu mi fai\n" +
                                "Ma non è così\n" +
                                "Piano dormi e vai\n" +
                                "\n" +
                                "E più in là\n" +
                                "Più in là\n" +
                                "Io lo so\n" +
                                "Tu mi fai\n" +
                                "\n" +
                                "Vera scivola\n" +
                                "E sento che sei\n" +
                                "Dove non sei mai\n" +
                                "Ora dormi in me\n" +
                                "E so che non dovrei\n" +
                                "Dirti dove sei\n" +
                                "\n" +
                                "E più in là\n" +
                                "Più in là\n" +
                                "Io lo so\n" +
                                "Tu mi fai\n"));
                        arrayCanzoni.add(new Canzone("Dentro Sharon","Tremi un pò\n" +
                                "E non è facile\n" +
                                "Urlare nei rumori tuoi\n" +
                                "Per te\n" +
                                "Dentro Sharon\n" +
                                "Nell'immagine\n" +
                                "Perdo spesso un po' di me\n" +
                                "In te\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione\n" +
                                "\n" +
                                "Già da un pò\n" +
                                "Sono agli ordini\n" +
                                "I tuoi occhi su di me\n" +
                                "Oh no\n" +
                                "Dentro Sharon\n" +
                                "Nell'immagine\n" +
                                "Fuori il mondo grida e qui\n" +
                                "Io e te\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione\n" +
                                "\n" +
                                "Shaaa... Sharon\n" +
                                "Shaaa... Sharon...\n" +
                                "Shaaa... Sharon\n" +
                                "Shaaa... Sharon\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione...\n" +
                                "Confusione..."));
                        arrayCanzoni.add(new Canzone("Caramel Pop","Caramel pop\n" +
                                "Caramel pop\n" +
                                "Caramel pop\n" +
                                "Quella cosa che senti\n" +
                                "Quando sei vuoto\n" +
                                "Tutto quello che vorresti\n" +
                                "E che non hai\n" +
                                "Tutto quello che sei\n" +
                                "O che non sei mai stato\n" +
                                "Tutto\n"));
                        arrayCanzoni.add(new Canzone("Viba","Sono sveglio o forse no\n" +
                                "Ma non m'importa\n" +
                                "Tu sei l'unica per me\n" +
                                "Sarò lento quanto vuoi\n" +
                                "Tu non ti senti più\n" +
                                "Così fragile\n" +
                                "\n" +
                                "Io con te\n" +
                                "Solo che ci sei\n" +
                                "Quando non mi vuoi\n" +
                                "Io sto bene\n" +
                                "Com'è buio, lo sai\n" +
                                "Non ti sbagli mai\n" +
                                "\n" +
                                "Non mi spiego quasi mai\n" +
                                "Ma non ho fretta\n" +
                                "Voglio bene a un po' di me\n" +
                                "Forse sbaglio o forse no\n" +
                                "Tu non ti senti più\n" +
                                "Così fragile\n" +
                                "\n" +
                                "Io con te\n" +
                                "Solo che ci sei\n" +
                                "Quando non mi vuoi\n" +
                                "Io sto bene\n" +
                                "Com'è buio, lo sai\n" +
                                "Non ti sbagli mai\n" +
                                "\n" +
                                "Così vicina a me\n" +
                                "Ma così fuori da me\n" +
                                "In fondo tu mi vuoi\n" +
                                "E se mi vuoi\n" +
                                "Io volo eeeeeeh\n" +
                                "Io volo eeeeeeh"));
                        arrayCanzoni.add(new Canzone("Ultranoia","No\n" +
                                "Non ci sei\n" +
                                "È strano sai\n" +
                                "Sentirti come me\n" +
                                "Qui\n" +
                                "Sfregami\n" +
                                "È qui che stai\n" +
                                "Soffiando su di me\n" +
                                "\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Lei\n" +
                                "Piano corre da me\n" +
                                "Tu\n" +
                                "Tu mi spegni\n" +
                                "Se\n" +
                                "Sei tu\n" +
                                "\n" +
                                "Che mi vuoi\n" +
                                "Fuori di me\n" +
                                "È giusto sai\n" +
                                "Sentirti su di me\n" +
                                "Tu\n" +
                                "Seno blu\n" +
                                "Mi vuoi per te\n" +
                                "Mi sento così giù\n" +
                                "\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Lei\n" +
                                "Piano corre da me\n" +
                                "Tu\n" +
                                "Tu mi spegni\n" +
                                "Se\n" +
                                "Sei tu\n" +
                                "\n" +
                                "Che mi vuoi\n" +
                                "Fuori di me\n" +
                                "È giusto sai\n" +
                                "Sentirti come me\n" +
                                "Qui\n" +
                                "Sfregami\n" +
                                "È qui che stai\n" +
                                "Soffiando su di me\n" +
                                "\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Lei\n" +
                                "Piano corre da me\n" +
                                "Tu\n" +
                                "Tu mi spegni\n" +
                                "Se\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Lei\n" +
                                "Piano corre da me\n" +
                                "Tu\n" +
                                "Tu mi spegni\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu"));
                        arrayCanzoni.add(new Canzone("Zoe","Io non dormo mai\n" +
                                "Dormo in me\n" +
                                "Scuse solide\n" +
                                "La mia immagine\n" +
                                "Non sono io\n" +
                                "Sento ridere\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Io non dormo mai\n" +
                                "E so\n" +
                                "Scuse ruvide\n" +
                                "La mia vanità\n" +
                                "Non sono io\n" +
                                "Sento ridere\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Su di te\n" +
                                "Te\n" +
                                "Te\n" +
                                "Te\n"));
                        arrayCanzoni.add(new Canzone("Bambina in nero","Lei si consuma su di me\n" +
                                "Lei si nasconde ma non so dov'è\n" +
                                "Con le tue ali in coma stai\n" +
                                "Lei non ha tempo Io non so perché\n" +
                                "Perché\n" +
                                "\n" +
                                "E tu sei sola\n" +
                                "E tu sei sola\n" +
                                "\n" +
                                "Lei si consuma su di me\n" +
                                "Lei si consuma lenta dentro me\n" +
                                "Con le tue mani in coma stai\n" +
                                "Lei non ha tempo io non so perché\n" +
                                "Perché\n" +
                                "\n" +
                                "E tu sei sola\n" +
                                "E tu sei sola\n" +
                                "Tu sei sola\n" +
                                "E tu sei sola"));
                        arrayCanzoni.add(new Canzone("eyeliner","Vedi blu\n" +
                                "E ti senti fragile\n" +
                                "Ora, sgomma\n" +
                                "Vieni giù\n" +
                                "E non c'è da ridere\n" +
                                "\n" +
                                "Lei mi incolla\n" +
                                "Incolla\n" +
                                "\n" +
                                "Non sono mai\n" +
                                "Come mi vorrei\n" +
                                "Ora sgomma\n" +
                                "Così fai\n" +
                                "Quel che puoi per me\n" +
                                "\n" +
                                "Lei mi incolla\n" +
                                "Incolla\n" +
                                "Incolla\n" +
                                "\n" +
                                "Vedi blu\n" +
                                "E ti senti fragile\n" +
                                "Ora, sgomma\n" +
                                "Vieni giù\n" +
                                "E non c'è da ridere\n" +
                                "\n" +
                                "Lei mi incolla\n" +
                                "Incolla\n" +
                                "Incolla, uh\n" +
                                "Incolla\n" +
                                "Incolla, uh\n" +
                                "Incolla, incolla\n" +
                                "Incolla, incolla\n" +
                                "Incolla, yeah"));
                        break;
                    case 4:
                        arrayCanzoni.add(new Canzone("Viba","Sono sveglio o forse no\n" +
                                "Ma non m'importa\n" +
                                "Tu sei l'unica per me\n" +
                                "Sarò lento quanto vuoi\n" +
                                "Tu non ti senti più\n" +
                                "Così fragile\n" +
                                "\n" +
                                "Io con te\n" +
                                "Solo che ci sei\n" +
                                "Quando non mi vuoi\n" +
                                "Io sto bene\n" +
                                "Com'è buio, lo sai\n" +
                                "Non ti sbagli mai\n" +
                                "\n" +
                                "Non mi spiego quasi mai\n" +
                                "Ma non ho fretta\n" +
                                "Voglio bene a un po' di me\n" +
                                "Forse sbaglio o forse no\n" +
                                "Tu non ti senti più\n" +
                                "Così fragile\n" +
                                "\n" +
                                "Io con te\n" +
                                "Solo che ci sei\n" +
                                "Quando non mi vuoi\n" +
                                "Io sto bene\n" +
                                "Com'è buio, lo sai\n" +
                                "Non ti sbagli mai\n" +
                                "\n" +
                                "Così vicina a me\n" +
                                "Ma così fuori da me\n" +
                                "In fondo tu mi vuoi\n" +
                                "E se mi vuoi\n" +
                                "Io volo eeeeeeh\n" +
                                "Io volo eeeeeeh"));
                        arrayCanzoni.add(new Canzone("Stenuo","Io non so se vorrei\n" +
                                "Ti odio ancora più che mai\n" +
                                "Sono su MTV\n" +
                                "Sento il freno che poi non sei tu\n" +
                                "\n" +
                                "Se stenui in più\n" +
                                "Non sei più anoide, mestile\n" +
                                "\n" +
                                "Io sto giù e tu no\n" +
                                "Mi senti bene ancora, io non so\n" +
                                "Ora che ci sei tu\n" +
                                "Mi sento uguale, è ora di andarsene giù\n" +
                                "\n" +
                                "Se stenui in più\n" +
                                "Non sei più anoide, mestile\n" +
                                "\n" +
                                "Se stenui in più\n" +
                                "Non sei più anoide, mestile\n" +
                                "\n" +
                                "Se stenui in più\n" +
                                "Non sei più anoide, mestile\n"));
                        arrayCanzoni.add(new Canzone("Sunshine of Your Love","It’s getting near dawn\n" +
                                "When lights close their tired eyes\n" +
                                "I'll soon be with you, my love\n" +
                                "To give you my dawn surprise\n" +
                                "I'll be with you, darling, soon\n" +
                                "I'll be with you when the stars start falling, ah\n" +
                                "Start falling\n" +
                                "\n" +
                                "I've been waiting so long\n" +
                                "To be where I'm going\n" +
                                "In the sunshine of your love\n" +
                                "\n" +
                                "I'm with you, my love\n" +
                                "The lights shining through on you\n" +
                                "Yes, I'm with you, my love\n" +
                                "And it's the morning and just we two\n" +
                                "I'll stay with you, darling, now\n" +
                                "I'll stay with you 'til my seas are all drying on\n" +
                                "Drying on, woah\n" +
                                "\n" +
                                "I've been waiting so long\n" +
                                "To be where I'm going\n" +
                                "In the sunshine of your love, oh\n" +
                                "\n" +
                                "It’s getting near dawn\n" +
                                "When lights close their tired eyes\n" +
                                "I'll soon be with you, my love\n" +
                                "To give you my dawn surprise\n" +
                                "I'll be with you, darling, soon\n" +
                                "I'll be with you when the stars start falling, ah\n" +
                                "Start falling\n" +
                                "\n" +
                                "I've been waiting so long\n" +
                                "I've been waiting so long\n" +
                                "I've been waiting so long\n" +
                                "To be where I'm going\n" +
                                "In the sunshine of your love"));
                        arrayCanzoni.add(new Canzone("Cretina","[Strumentale]"));
                        break;
                    case 5:
                        arrayCanzoni.add(new Canzone("La Tua Fretta","Tu lo sai\n" +
                                "Non è così vera la fretta in te\n" +
                                "Colpisco a fondo ora che ci sei\n" +
                                "E brucio ogni gioia\n" +
                                "\n" +
                                "Ma è tutto ok\n" +
                                "Ma è tutto ok\n" +
                                "\n" +
                                "Ogni possibilità\n" +
                                "Infuria nei tuoi perché\n" +
                                "Tu nell'ambiente che c'è ci sei\n" +
                                "E bruci ogni gioia\n" +
                                "\n" +
                                "Ma è tutto ok\n" +
                                "Ma è tutto ok\n" +
                                "\n" +
                                "Vera\n" +
                                "La fretta è in te\n" +
                                "È solo che ti rivorrei"));
                        arrayCanzoni.add(new Canzone("Spaceman","Spaceman\n" +
                                "La fine è qui e ti cullerà\n" +
                                "Io temo di vincerti\n" +
                                "La vertigine in volo\n" +
                                "Nessuno saprà mai che in questo cielo\n" +
                                "Dovrò concluderti\n" +
                                "Nel blu\n" +
                                "Io nel blu\n" +
                                "\n" +
                                "Spaceman\n" +
                                "Tu giura è qui che m'incontrerai\n" +
                                "E sarai simile a me\n" +
                                "\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "\n" +
                                "Spaceman\n" +
                                "La fine è qui e ti cullerà\n" +
                                "Io temo di vincerti\n" +
                                "La vertigine in volo\n" +
                                "Respira in vene lisce e questo è bene\n" +
                                "Dovrò concluderti\n" +
                                "Concluderti\n" +
                                "\n" +
                                "Spaceman\n" +
                                "Spaceman\n" +
                                "Spaceman"));
                        arrayCanzoni.add(new Canzone("Nova","Distinguimi se puoi\n" +
                                "E so che tu lo fai bene in lacrime\n" +
                                "Consumi vuoti blu in più\n" +
                                "Colpisci a fondo e sfiorami\n" +
                                "\n" +
                                "Ma resti ancora immobile\n" +
                                "Distendimi ed inventa un senso\n" +
                                "Per poi sorprendermi\n" +
                                "\n" +
                                "Adorami, dudu\n" +
                                "Conquistami ed illudimi\n" +
                                "Respingimi se puoi, di più\n" +
                                "Sai finger bene è inutile\n" +
                                "\n" +
                                "Ma resti ancora immobile\n" +
                                "Distendimi ed inventa un senso\n" +
                                "Per poi sorprendermi\n" +
                                "Per poi sorprendermi\n" +
                                "Per poi sorprendermi, eh\n" +
                                "\n" +
                                "Mi spremi e vomito\n" +
                                "Insegui ardori e sudi vento\n" +
                                "Mi spogli il panico\n" +
                                "Ti svesti bene e giuro è questo\n" +
                                "Mi spogli il panico\n" +
                                "\n" +
                                "Adorami, dudu\n" +
                                "Conquista e illumini\n" +
                                "Sfiorami, dudu\n" +
                                "Respingi echi in nuvole\n" +
                                "Nuvole\n" +
                                "Nuvole"));
                        arrayCanzoni.add(new Canzone("Cara prudenza","A quanto pare sei\n" +
                                "Più lucida di me\n" +
                                "Così lo scoprirai\n" +
                                "Da te, da te\n" +
                                "Sei consapevole\n" +
                                "Di non sentirti più\n" +
                                "In me, in me\n" +
                                "\n" +
                                "E in ogni crimine\n" +
                                "Che sei\n" +
                                "E in ogni crimine\n" +
                                "Che fai\n" +
                                "E in ogni crimine\n" +
                                "Che sei\n" +
                                "E in ogni crimine\n" +
                                "\n" +
                                "La mia mediocrità\n" +
                                "È la mia agilità\n" +
                                "Sei porpora, oddio\n" +
                                "Chi sei, chi sei\n" +
                                "Allenati con me\n" +
                                "Immergimi nei tuoi\n" +
                                "Perché, perché\n" +
                                "\n" +
                                "E in ogni crimine\n" +
                                "Che sei\n" +
                                "E in ogni crimine\n" +
                                "E in ogni crimine Che sei\n" +
                                "E in ogni crimine\n" +
                                "Che fai\n" +
                                "E in ogni crimine\n" +
                                "Che sei\n" +
                                "E in ogni crimine\n" +
                                "Mine, ah\n" +
                                "\n" +
                                "Ma ancora io non so\n" +
                                "Le cose che dirò\n" +
                                "Di te\n" +
                                "(E in ogni crimine) Di te\n" +
                                "(E in ogni crimine) Di te\n" +
                                "(E in ogni crimine) Di te"));
                        arrayCanzoni.add(new Canzone("Onan","Ora sembra inutile\n" +
                                "Ora voli al limite\n" +
                                "Ora che ti sentirei più che mai\n" +
                                "Ebbene ti raggiungerei\n" +
                                "\n" +
                                "Mi spremi e inventi nuvole\n" +
                                "E m'illudo spesso come se\n" +
                                "\n" +
                                "Poi la vertigine\n" +
                                "Non è più semplice\n" +
                                "Ora svuoto gli occhi miei\n" +
                                "Onan, vorrei\n" +
                                "Ebbene ti raggiungerei\n" +
                                "\n" +
                                "Mi spremi e inventi nuvole\n" +
                                "E m'illudo spesso come se\n" +
                                "Non c'è\n" +
                                "Io ti raggiungerei\n" +
                                "\n" +
                                "Non è più impossibile\n" +
                                "Sembri impenetrabile\n" +
                                "Ora chiedimi perché\n" +
                                "Non è più così semplice\n" +
                                "Dovrei sopravvivere\n" +
                                "Ora giura è impossibile, ah\n" +
                                "Se ti raggiungerei\n" +
                                "\n" +
                                "Mi spremi e inventi nuvole\n" +
                                "E m'illudo spesso come se\n" +
                                "\n" +
                                "Non è più impossibile\n" +
                                "Sembri impenetrabile\n" +
                                "Ora chiedimi perché\n" +
                                "Non è più così semplice\n" +
                                "Dovrei sopravvivere\n" +
                                "Ora giura è impossibile, ah\n" +
                                "Se ti raggiungerei\n" +
                                "\n" +
                                "Mi spremi e inventi nuvole\n" +
                                "E m'illudo spesso come se\n" +
                                "\n" +
                                "La tua vertigine\n" +
                                "Non è mai stata semplice\n" +
                                "Per me"));
                        arrayCanzoni.add(new Canzone("Starless","Sei la mia gioia insensibile\n" +
                                "E questo è come ti rivorrei\n" +
                                "Ma è tutto così normale il male che vorrei\n" +
                                "Da te\n" +
                                "\n" +
                                "E ancora spero come non mai\n" +
                                "Di renderti ogni perché\n" +
                                "Ma ancora è così normale il male che vorrei\n" +
                                "Per te\n" +
                                "\n" +
                                "Sarò così falso\n" +
                                "E sarò così solo per te\n" +
                                "È giusto che sia immorale il male che vorrei per te\n" +
                                "Per te, per te\n" +
                                "Per te, per te\n" +
                                "\n" +
                                "Io sarò così falso\n" +
                                "Lo sarò così solo per te\n" +
                                "È giusto che sia normale il male che vorrei per te\n" +
                                "Per te\n" +
                                "\n" +
                                "Sunchild\n" +
                                "Sunchild\n" +
                                "Sunchild\n" +
                                "Sunchild, sunchild\n" +
                                "Sunchild, sunchild\n" +
                                "Sunchild"));
                        arrayCanzoni.add(new Canzone("Miami Safari","Stridi in me, ruvida\n" +
                                "Respingimi, dolce nuvola\n" +
                                "Ti creerei noie in più\n" +
                                "E giura sei così umida\n" +
                                "\n" +
                                "Trovami semplice\n" +
                                "Trovami semplice\n" +
                                "Trovami semplice\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "\n" +
                                "Sei il crimine che vorrei\n" +
                                "Ebbene tu, ali solide\n" +
                                "\n" +
                                "Trovami semplice\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "\n" +
                                "Credo poi che dovrei\n" +
                                "Respingerti come non mai"));
                        arrayCanzoni.add(new Canzone("Nel Mio Letto","È me-, meglio\n" +
                                "Che ci sia\n" +
                                "Un'ora in più\n" +
                                "Ed io dormo\n" +
                                "E giudico\n" +
                                "Le ombre su di noi\n" +
                                "\n" +
                                "E non ho più fretta\n" +
                                "E non ho più fretta\n" +
                                "Perché ho paura\n" +
                                "Paura\n" +
                                "\n" +
                                "E qui, qui\n" +
                                "Starò meglio che mai\n" +
                                "Avvolto di me\n" +
                                "\n" +
                                "Io non ho più fretta\n" +
                                "Io non ho più fretta\n" +
                                "Perché ho paura\n" +
                                "Paura\n" +
                                "\n" +
                                "Io non ho più fretta\n" +
                                "Io non ho più fretta\n" +
                                "Perché ho paura (Paura)\n" +
                                "Paura (Paura)\n" +
                                "Paura (Paura)\n" +
                                "Paura (Paura)\n"));
                        arrayCanzoni.add(new Canzone("1000 Anni Con Elide","Mi illudi distratta\n" +
                                "E crei ciò che vorrei\n" +
                                "Con piume blu stringimi satura\n" +
                                "Tu giura e fingi\n" +
                                "E poi cuci il limite\n" +
                                "Mi smuovi e rendimi satura\n" +
                                "\n" +
                                "Ed io saprei reagire per te\n" +
                                "Ma tu sei ovunque\n" +
                                "\n" +
                                "Mi giungi immensa\n" +
                                "Consumati su di me\n" +
                                "Mi smuovi e rendimi sicura e satura\n" +
                                "\n" +
                                "Ed io saprei reagire per te\n" +
                                "Ma tu sei ovunque ovunque\n" +
                                "\n" +
                                "Hai quello che io vorrei fragile Elide\n" +
                                "\n" +
                                "Ma tu sei ovunque\n"));
                        arrayCanzoni.add(new Canzone("Buona Risposta","So di non sorprenderti\n" +
                                "È comunque inutile\n" +
                                "Dovrei credermi\n" +
                                "Dovrei convincermi che sei\n" +
                                "Dove sei\n" +
                                "Così vincimi e sarò\n" +
                                "Immune e sterile\n" +
                                "Dovrei esigerlo da me\n" +
                                "Ebbene io vorrei\n" +
                                "Chi vorrei, hey\n" +
                                "Quello che non sei\n" +
                                "Non può più esistere\n" +
                                "Giuro non lo farò mai, mai\n" +
                                "Tutto ciò che insegue me\n" +
                                "Io non l'ho chiesto sai\n" +
                                "Più rivincite vorrei\n" +
                                "Per renderti instabile, instabile, hey\n" +
                                "Come vorrei\n" +
                                "Sfuggire al niente\n" +
                                "Per non restare sopra di te\n" +
                                "E non reagire\n" +
                                "Yeah, yeah, yeah yeah yeah, yeah\n" +
                                "Uuh\n" +
                                "Così vincimi e sarò\n" +
                                "Immune e sterile, eh\n" +
                                "Dovrei credermi\n" +
                                "Dovrei convincermi che sei\n" +
                                "Dove sei\n" +
                                "Come vorrei\n" +
                                "E so che dovrei\n" +
                                "Sfuggire al niente\n" +
                                "Per non restare sopra di te\n" +
                                "E non reagire\n" +
                                "Yeah, yeah, yeah yeah yeah, yeah\n" +
                                "Uuh"));
                        arrayCanzoni.add(new Canzone("Centrifuga","Lo sai che lei è immobile\n" +
                                "È tutto ciò che so di lei\n" +
                                "E infine senti che c'è\n" +
                                "Ed ora scegli chi c'è in te\n" +
                                "\n" +
                                "Lei che non è mai la verità\n" +
                                "È tutto ciò che ho di lei\n" +
                                "Mi arrendo e sento che c'è\n" +
                                "In fondo è certo per me\n" +
                                "\n" +
                                "E comunque sia tu nei sensi e nell'immagine\n" +
                                "Puoi convincermi tutto in fondo è così semplice\n" +
                                "Ed inutile\n" +
                                "\n" +
                                "Ora resterai immobile\n" +
                                "Ed io sarò infallibile\n" +
                                "È tutto scelto per me\n" +
                                "In tutto quello che c'è in me\n" +
                                "\n" +
                                "E comunque sia tu nei sensi e nell'immagine\n" +
                                "Puoi convincermi tutto in fondo è così semplice\n" +
                                "Ed inutile"));
                        arrayCanzoni.add(new Canzone("Meduse E Tappeti","E infine tu sei ovunque\n" +
                                "Estingui l'uomo che sei\n" +
                                "In fiore tu la cura\n" +
                                "Che c'è e gridi chi sei\n" +
                                "\n" +
                                "Queste gocce di ruggine che scorrono lente...\n" +
                                "\n" +
                                "Un superman conquista\n" +
                                "E tu slegami come sai\n" +
                                "Ora non ho più sfide\n" +
                                "Io ho e hai un airbag\n" +
                                "E tu sei qui e mi confondi\n" +
                                "Solo tu sai\n" +
                                "\n" +
                                "Queste gocce di ruggine che scorrono lente...\n" +
                                "\n" +
                                "Superman finge"));
                        break;
                    case 6:
                        arrayCanzoni.add(new Canzone("Spaceman","Spaceman\n" +
                                "La fine è qui e ti cullerà\n" +
                                "Io temo di vincerti\n" +
                                "La vertigine in volo\n" +
                                "Nessuno saprà mai che in questo cielo\n" +
                                "Dovrò concluderti\n" +
                                "Nel blu\n" +
                                "Io nel blu\n" +
                                "\n" +
                                "Spaceman\n" +
                                "Tu giura è qui che m'incontrerai\n" +
                                "E sarai simile a me\n" +
                                "\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "In ogni io che sei\n" +
                                "(Tururutu)\n" +
                                "\n" +
                                "Spaceman\n" +
                                "La fine è qui e ti cullerà\n" +
                                "Io temo di vincerti\n" +
                                "La vertigine in volo\n" +
                                "Respira in vene lisce e questo è bene\n" +
                                "Dovrò concluderti\n" +
                                "Concluderti\n" +
                                "\n" +
                                "Spaceman\n" +
                                "Spaceman\n" +
                                "Spaceman"));
                        arrayCanzoni.add(new Canzone("Blue","E ancora scarto ogni bugia\n" +
                                "Le sento insistere nella pazzia\n" +
                                "Che c'è\n" +
                                "Quella tua soglia instabile\n" +
                                "Sulle mie guance solide\n" +
                                "Perché io sia in ogni perché\n" +
                                "\n" +
                                "Io credo non sarò più così blue\n" +
                                "Così blue\n" +
                                "\n" +
                                "Vorrei concludere così\n" +
                                "E aggiungo quello che\n" +
                                "Io non vorrei ma c'è\n" +
                                "Distruggo le mie fantasie\n" +
                                "Sulle mie labbra insolite\n" +
                                "E rido nella mia follia\n" +
                                "\n" +
                                "Ed ora che mi senti così blue\n" +
                                "Così blue\n" +
                                "Così blue\n" +
                                "Così blue\n" +
                                "Così blue\n" +
                                "Così blue\n" +
                                "Così blue\n" +
                                "Così blue, eh\n" +
                                "Così blue, eh\n" +
                                "Così blue, eh\n" +
                                "\n" +
                                "Sai perché\n" +
                                "Solo tu sai perché\n" +
                                "Sai perché\n" +
                                "Solo tu sai perché"));
                        arrayCanzoni.add(new Canzone("Reverberation","Well, you finally find your helpless mind\n" +
                                "Is trapped inside your skin\n" +
                                "You want to leave\n" +
                                "But you believe you won't get back again\n" +
                                "You only know\n" +
                                "You have to go but still you can't get out\n" +
                                "You try and try\n" +
                                "You die and die\n" +
                                "You're stopped by your own doubt\n" +
                                "\n" +
                                "Reverberation\n" +
                                "Reverberation\n" +
                                "\n" +
                                "You find no peace\n" +
                                "It doesn't cease\n" +
                                "It's deadly irritation\n" +
                                "It keeps you blind\n" +
                                "It's there behind\n" +
                                "Your every hesitation\n" +
                                "It holds your thought\n" +
                                "Your mind is caught\n" +
                                "Your fixed with fascination\n" +
                                "You think you'll die\n" +
                                "It's just a lie\n" +
                                "It's backward elevation!\n" +
                                "\n" +
                                "Reverberation\n" +
                                "Reverberation\n" +
                                "\n" +
                                "You see reverberation\n" +
                                "In your latest incarnation\n" +
                                "You think it's a sensation\n" +
                                "But it's just reverberation\n" +
                                "You start to serve\n" +
                                "The downward curve\n" +
                                "That catches up your fears\n" +
                                "Each thing you do\n" +
                                "Comes home to you\n" +
                                "And pounds inside your ears\n" +
                                "Your start to fight against the night\n" +
                                "That screams inside your mind\n" +
                                "When something black it answers back\n" +
                                "And grabs you from behind!\n" +
                                "Reverberation\n" +
                                "Echoing through your brain\n" +
                                "Reverberation\n" +
                                "Driving your mind insane\n" +
                                "Reverberation\n" +
                                "Causing your blood to drain\n" +
                                "Leaving just charred remains"));
                        arrayCanzoni.add(new Canzone("Sipario","[Strumentale]"));
                        break;
                    case 7:
                        arrayCanzoni.add(new Canzone("Miami Safari","Stridi in me, ruvida\n" +
                                "Respingimi, dolce nuvola\n" +
                                "Ti creerei noie in più\n" +
                                "E giura sei così umida\n" +
                                "\n" +
                                "Trovami semplice\n" +
                                "Trovami semplice\n" +
                                "Trovami semplice\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "\n" +
                                "Sei il crimine che vorrei\n" +
                                "Ebbene tu, ali solide\n" +
                                "\n" +
                                "Trovami semplice\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "(Sfiorami) Se ci sei\n" +
                                "\n" +
                                "Credo poi che dovrei\n" +
                                "Respingerti come non mai"));
                        arrayCanzoni.add(new Canzone("Solo un grande sasso Part I","Scopri i lividi\n" +
                                "Illusi su di te\n" +
                                "E nuda sei più dea\n" +
                                "Freni e svieni ed io non so\n" +
                                "Non so\n" +
                                "\n" +
                                "Rimi in briciole\n" +
                                "E sole su di te\n" +
                                "Ma tu non sei più vera\n" +
                                "E tutto quello che io so\n" +
                                "Io lo sooo\n" +
                                "Io lo sooooee\n" +
                                "Io lo sooo\n" +
                                "\n" +
                                "Nel tuo sfogo sai non sei\n" +
                                "Per niente male, e poi\n" +
                                "Brilla in lucciole sarò\n" +
                                "Confuso e debole"));
                        arrayCanzoni.add(new Canzone("Solo un grande sasso Part II","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Creepy Smell","And you send your pictures for my wall\n" +
                                "My wall\n" +
                                "\n" +
                                "With a will to learn\n" +
                                "Just wait for cheap lil' bastard burn\n" +
                                "Hide behind the face\n" +
                                "Must destroy disgrace\n" +
                                "\n" +
                                "You disgrace me\n" +
                                "\n" +
                                "Now\n" +
                                "Now you know what it's like to cry\n" +
                                "Creepy Crover\n" +
                                "Creepy Crover\n" +
                                "Creepy Crover"));
                        arrayCanzoni.add(new Canzone("Morbida","Blu tu dolce blu\n" +
                                "Non hai più tempo e spazi no...\n" +
                                "Illudimi di più tu gioia morbida\n" +
                                "Tu gioia morbida\n" +
                                "\n" +
                                "Poi o forse mai\n" +
                                "Togli il rosso in scatola\n" +
                                "E questa non è più\n" +
                                "La solita bugia\n" +
                                "Tu gioia morbida\n" +
                                "Tu gioia morbida\n" +
                                "\n" +
                                "Il blu non torna più\n" +
                                "Sono in ogni oscurità\n" +
                                "La tregua che non c'è\n" +
                                "Mi uccide l'anima\n" +
                                "E perde l'anima\n" +
                                "Tu gioia morbida\n" +
                                "Tu gioia morbida\n" +
                                "Tu gioia morbida"));
                        break;
                    case 8:
                        arrayCanzoni.add(new Canzone("Sulle labbra","La tua primavera è un incubo\n" +
                                "In cui lo stato cede alla pornografia\n" +
                                "Il niente e il niente da distinguere\n" +
                                "Finchè poi non sai più cosa sentire\n" +
                                "\n" +
                                "Pensi di avere un credo\n" +
                                "Poi lo adatti a quello che sei\n" +
                                "\n" +
                                "E come può il mio amore essere limpido\n" +
                                "Se è la mia nazione che l'inquina\n" +
                                "So come un uomo deve decidere\n" +
                                "Ma ora non so più cosa sentire\n" +
                                "\n" +
                                "Ti ritrovi sulle labbra\n" +
                                "A giustificarti quel che sei\n" +
                                "\n" +
                                "Anche odiare è un diritto, sai?\n" +
                                "\n" +
                                "La tua primavera è un incubo\n" +
                                "Disobbedire acquista un senso in più"));
                        arrayCanzoni.add(new Canzone("Voglio una pelle splendida","Stringimi madre\n" +
                                "Ho molto peccato\n" +
                                "Ma la vita è un suicidio\n" +
                                "L'amore un rogo\n" +
                                "E voglio un pensiero superficiale\n" +
                                "Che renda la pelle splendida\n" +
                                "\n" +
                                "Senza un finale che faccia male\n" +
                                "Coi cuori sporchi e le mani lavate\n" +
                                "A salvarmi, vieni a salvarmi\n" +
                                "Salvami, bacia il colpevole\n" +
                                "Se dice la verità\n" +
                                "\n" +
                                "Ma, sì\n" +
                                "Ma, sì\n" +
                                "Ma, sì\n" +
                                "Ma, sì\n" +
                                "\n" +
                                "Passo le notti\n" +
                                "Nero e cristallo\n" +
                                "A sceglier le carte\n" +
                                "Che giocherei\n" +
                                "A maledire certe domande\n" +
                                "Che forse era meglio\n" +
                                "Non farsi mai\n" +
                                "\n" +
                                "E voglio un pensiero superficiale\n" +
                                "Che renda la pelle splendida\n" +
                                "A salvarmi, vieni a salvarmi\n" +
                                "Salvami, bacia il colpevole\n" +
                                "Se dice la verità\n" +
                                "\n" +
                                "Mercy\n" +
                                "Mercy\n" +
                                "Mercy\n" +
                                "Mercy\n" +
                                "\n" +
                                "E voglio un pensiero superficiale\n" +
                                "Che renda la pelle splendida\n" +
                                "A salvarmi, vieni a salvarmi\n" +
                                "Salvami, bacia il colpevole\n" +
                                "Se dice la verità\n" +
                                "\n" +
                                "Mercy\n" +
                                "Mercy\n" +
                                "Mercy\n" +
                                "Mercy\n"));
                        arrayCanzoni.add(new Canzone("Male di miele","La sicurezza ha un ventre tenero\n" +
                                "Ma è un demonio steso fra di noi\n" +
                                "Ti manca e quindi puoi non crederlo\n" +
                                "Ma io non mi sentivo libero\n" +
                                "\n" +
                                "E non è dolce essere unici\n" +
                                "Ma se hai un proiettile ti libero\n" +
                                "Gli errori veri son più forti poi\n" +
                                "Quando fan finta di esser morti, lo sai\n" +
                                "\n" +
                                "Copriti bene se ti senti fredda\n" +
                                "Hai la pressione bassa nell'anima\n" +
                                "Com'è strano il sapore che non riesco a sentire\n" +
                                "Male di miele\n" +
                                "\n" +
                                "E la grandezza della mia morale\n" +
                                "È proporzionale al mio successo\n" +
                                "Così ho rifatto il letto al meglio sai\n" +
                                "Che sembra non ci abbiam dormito mai\n" +
                                "\n" +
                                "Copriti bene se ti senti fredda\n" +
                                "Hai la pressione bassa nell'anima\n" +
                                "Com'è strano il sapore che non riesco a sentire\n" +
                                "Male di miele\n" +
                                "\n" +
                                "Ti do le stesse possibilità\n" +
                                "Di neve al centro dell'inferno, ti va?"));
                        arrayCanzoni.add(new Canzone("Non è per sempre","Dici che i tuoi fiori si sono rovinati\n" +
                                "Non hai abilità\n" +
                                "Questa nazione è brutta\n" +
                                "Ti fa sentire asciutta\n" +
                                "Senza volontà\n" +
                                "E gioca a fare Dio\n" +
                                "Manipolando il tuo DNA\n" +
                                "Così se vuoi cambiare\n" +
                                "Invece resti uguale per l'eternità\n" +
                                "\n" +
                                "Ma non c'è niente\n" +
                                "Che sia per sempre\n" +
                                "Perciò se è da un pò\n" +
                                "Che stai così male\n" +
                                "Il tuo diploma in fallimento\n" +
                                "È una laurea per reagire\n" +
                                "\n" +
                                "Puoi finger bene\n" +
                                "Ma so che hai fame\n" +
                                "\n" +
                                "Tutto è efficacia, razionalità\n" +
                                "Niente può stupire\n" +
                                "E non è certo il tempo\n" +
                                "Quello che ti invecchia\n" +
                                "Che ti fa morire\n" +
                                "Ma tu rifiuti di ascoltare\n" +
                                "Ogni segnale che ti può cambiare\n" +
                                "Perché ti fa paura\n" +
                                "Quello che succederà\n" +
                                "Se poi ti senti uguale\n" +
                                "\n" +
                                "Ma non c'è niente\n" +
                                "Che sia per sempre\n" +
                                "Perciò se è da un pò\n" +
                                "Che stai così male\n" +
                                "Il tuo diploma in fallimento\n" +
                                "È una laurea per reagire\n" +
                                "\n" +
                                "Sai finger bene\n" +
                                "Ma so che hai fame\n" +
                                "\n" +
                                "Non è niente\n" +
                                "Non è per sempre\n" +
                                "È troppo ormai\n" +
                                "Che stai così male\n" +
                                "Il tuo diploma in fallimento\n" +
                                "È una laurea per reagire\n" +
                                "\n" +
                                "Non è niente\n" +
                                "Non è per sempre"));
                        arrayCanzoni.add(new Canzone("Dentro Marilyn","Lei è qua, falsità come radioattività\n" +
                                "Che mentre c'è da osare\n" +
                                "Uccide lo spettacolo carnale\n" +
                                "E l'anima brucia più di quanto illumini\n" +
                                "Ma è un addestramento mentre attendo\n" +
                                "\n" +
                                "Che io m'accorga che so respirare\n" +
                                "Che sei il mio sovversivo\n" +
                                "Mio sovversivo amore\n" +
                                "Non c'è torto o ragione\n" +
                                "È il naturale processo di eliminazione\n" +
                                "\n" +
                                "Forse se, forse se porta ad esitare\n" +
                                "Io vengo dall'errore, uno solo\n" +
                                "Del tutto inadatto al volo\n" +
                                "E anche se vedo il buio, così chiaramente\n" +
                                "Io penso la bugia affascinante\n" +
                                "\n" +
                                "E non mi accorgo che so respirare\n" +
                                "Che sei il mio sovversivo\n" +
                                "Mio sovversivo amore\n" +
                                "Non c'è torto o ragione\n" +
                                "È il naturale processo di eliminazione\n" +
                                "\n" +
                                "Lei è qua, lei è qua come radioattività\n" +
                                "Che mentre c'è da osare\n" +
                                "Uccide lo spettacolo carnale\n" +
                                "Cinque pianeti, tutti nel tuo segno\n" +
                                "Il fallimento è un grembo e io ti attendo\n" +
                                "\n" +
                                "Mentre ti scordi che puoi respirare\n" +
                                "Che sono il sovversivo\n" +
                                "Tuo sovversivo amore\n" +
                                "Non c'è torto o ragione\n" +
                                "È il naturale processo di eliminazione"));
                        arrayCanzoni.add(new Canzone("Tutto fa un pò male","Sai che la fortuna è una religione\n" +
                                "Tu ci credi oppure no\n" +
                                "Lo capiremo prima o poi\n" +
                                "Che non c'è modo di rinascere senza peccare\n" +
                                "Ma tu hai voglia di rinascere\n" +
                                "O è solo che non sai come finire\n" +
                                "\n" +
                                "E forse fa un po' male, forse fa un po' male\n" +
                                "Ma tutto fa un po' male, tutto fa un po' male\n" +
                                "\n" +
                                "Quello che sognavi ti fa ridere\n" +
                                "Da quando sai che non lo puoi più avere\n" +
                                "Ma l'odio è un carburante nobile\n" +
                                "E scommetto che non è così male\n" +
                                "Tradirsi con rispetto, perché vivere è reale\n" +
                                "E vivere così, non somiglia a morire?\n" +
                                "\n" +
                                "E forse fa un po' male, forse fa un po' male\n" +
                                "Ma tutto fa un po' male, tutto fa un po' male\n" +
                                "\n" +
                                "E forse fa un po' male, forse fa un po' male\n" +
                                "Ma tutto fa un po' male, tutto fa un po' male"));
                        arrayCanzoni.add(new Canzone("Nel mio letto","È me-, meglio\n" +
                                "Che ci sia\n" +
                                "Un'ora in più\n" +
                                "Ed io dormo\n" +
                                "E giudico\n" +
                                "Le ombre su di noi\n" +
                                "\n" +
                                "E non ho più fretta\n" +
                                "E non ho più fretta\n" +
                                "Perché ho paura\n" +
                                "Paura\n" +
                                "\n" +
                                "E qui, qui\n" +
                                "Starò meglio che mai\n" +
                                "Avvolto di me\n" +
                                "\n" +
                                "Io non ho più fretta\n" +
                                "Io non ho più fretta\n" +
                                "Perché ho paura\n" +
                                "Paura\n" +
                                "\n" +
                                "Io non ho più fretta\n" +
                                "Io non ho più fretta\n" +
                                "Perché ho paura (Paura)\n" +
                                "Paura (Paura)\n" +
                                "Paura (Paura)\n" +
                                "Paura (Paura)"));
                        arrayCanzoni.add(new Canzone("Ovunque (live)","È buio ormai\n" +
                                "Non mi frega se piangi o no ooh\n" +
                                "Io come te\n" +
                                "Confusione\n" +
                                "Ora lo so\n" +
                                "Non mi sento più bene da un pò\n" +
                                "Quello che fai non mi basta mai\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque\n" +
                                "\n" +
                                "Mi spazzi via\n" +
                                "E mi vedo volare lontano\n" +
                                "Che male fa\n" +
                                "Rivedermi in me\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque\n" +
                                "\n" +
                                "È buio ormai...\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque"));
                        arrayCanzoni.add(new Canzone("Meduse e tappeti (live) ","E infine tu sei ovunque\n" +
                                "Estingui l'uomo che sei\n" +
                                "In fiore tu la cura\n" +
                                "Che c'è e gridi chi sei\n" +
                                "\n" +
                                "Queste gocce di ruggine che scorrono lente...\n" +
                                "\n" +
                                "Un superman conquista\n" +
                                "E tu slegami come sai\n" +
                                "Ora non ho più sfide\n" +
                                "Io ho e hai un airbag\n" +
                                "E tu sei qui e mi confondi\n" +
                                "Solo tu sai\n" +
                                "\n" +
                                "Queste gocce di ruggine che scorrono lente...\n" +
                                "\n" +
                                "Superman finge"));
                        break;
                    case 9:
                        arrayCanzoni.add(new Canzone("Elefante","Blu\n" +
                                "L'impero è blu\n" +
                                "È questo che mi manca\n" +
                                "E mi provoca\n" +
                                "Più\n" +
                                "Direi di più\n" +
                                "Della tua pelle in fumo\n" +
                                "Che mi soffoca\n" +
                                "\n" +
                                "Precipita la verità\n" +
                                "È solo un pò\n" +
                                "Più debole\n" +
                                "\n" +
                                "Giù\n" +
                                "Mi pare giù\n" +
                                "È come scura e gonfia\n" +
                                "La mia satira\n" +
                                "Uh\n" +
                                "L'impero è blu\n" +
                                "Questa è la cura in rima, ci soddisferà\n" +
                                "\n" +
                                "Precipita la verità\n" +
                                "È solo un pò\n" +
                                "Più debole\n" +
                                "\n" +
                                "Boom\n" +
                                "Mi sparo boom\n" +
                                "Se la mia pelle è in fumo\n" +
                                "La tua soffoca\n" +
                                "La tua soffoca, la tua soffoca"));
                        arrayCanzoni.add(new Canzone("Perfect Day","Man, it's so proud to be used, mh\n" +
                                "The wind blows out my thoughts\n" +
                                "Just to hear 'em out\n" +
                                "The stars in her eyes\n" +
                                "Grind the river banks\n" +
                                "And tears into her eyes\n" +
                                "Such a perfect day\n" +
                                "You know it's such a perfect day\n" +
                                "You're talking so loud once again\n" +
                                "You're talking so loud once again\n" +
                                "You talk so loud once again\n" +
                                "You talk so loud once again\n" +
                                "'Cause it's such a perfect day"));
                        arrayCanzoni.add(new Canzone("Mu","Penso troppo a lungo, davvero\n" +
                                "Ma io non voglio essere noioso\n" +
                                "Ognuno ha già i suoi guai\n" +
                                "\n" +
                                "È sabato sera e devo darci dentro, tu ru ru\n" +
                                "\n" +
                                "Quanto più cambia più resta uguale\n" +
                                "Lo sai dovremo resistere per sempre\n" +
                                "Ed ora come stai?\n" +
                                "\n" +
                                "Lo sai, è sabato sera e devo darci dentro, tu ru ru\n" +
                                "\n" +
                                "Non c'è fiducia per niente\n" +
                                "Ma io credo in una svolta\n" +
                                "A che cosa serve svegliarsi se tu non ci sei?\n" +
                                "\n" +
                                "Ed ora è sabato sera e devo darci dentro\n" +
                                "Io devo darci dentro, tu ru ru\n"));
                        arrayCanzoni.add(new Canzone("Corteccia (nell'up-nea)","Come sto se vedo a malapena?\n" +
                                "Mi perdo nei giorni neri, li crei tu\n" +
                                "Fai di me l'anima più fredda\n" +
                                "Ci sei tu nelle mie vene e le curi pure\n" +
                                "\n" +
                                "Se affondo nell'up-nea non dormo più\n" +
                                "\n" +
                                "Quante sono le risposte?\n" +
                                "Ti prendi il mondo intero e non torni più\n" +
                                "\n" +
                                "Se affondo nell'up-nea non piove più\n" +
                                "\n" +
                                "Dove sto se ti vedo in bocca?\n" +
                                "È come sudare al sole che non c'è più\n" +
                                "Ma dopo un po' ritorna e commuove sempre\n" +
                                "\n" +
                                "Se affondo nell'up-nea\n" +
                                "\n" +
                                "Questa è la canzone per lei\n" +
                                "Che infetta la ragione, lo sai\n" +
                                "Fra mille mie parole ci sei\n" +
                                "Ma non mi avrai\n" +
                                "Questo non è giusto però\n" +
                                "Io spero rimarrai per un pò\n" +
                                "Fra mille combustioni ci sei\n" +
                                "Ma non mi avrai\n" +
                                "Non mi avrai\n" +
                                "Non mi avrai\n"));
                        arrayCanzoni.add(new Canzone("Passi da gigante","L'aria depura le mie gambe\n" +
                                "Che muoiono di freddo\n" +
                                "Ho l'impresione che si faccia così\n" +
                                "E tu mi dirai di si\n" +
                                "\n" +
                                "Eh eh\n" +
                                "\n" +
                                "Mi osservo ancora mentre nuoto\n" +
                                "E ne vedo ogni cavità\n" +
                                "Sono la carne che si taglia da sé\n" +
                                "E non credere che sia facile\n" +
                                "\n" +
                                "Oh oh\n" +
                                "\n" +
                                "Ridai profumo alle mie gambe\n" +
                                "Che sanno di cipolla\n" +
                                "Solo la carne che si mangia da sé\n" +
                                "Può ricrescere per sempre\n" +
                                "Può ricrescere sempre\n"));
                        break;
                    case 10:
                        arrayCanzoni.add(new Canzone("Logorrea (Esperti all'opera)","Gli esperti di moda\n" +
                                "Si grattano la gola\n" +
                                "Ed è giusto oppure no\n" +
                                "Capirne il senso etico?\n" +
                                "\n" +
                                "Ingoio un rospo\n" +
                                "Ingoio un rospo\n" +
                                "\n" +
                                "Odio il varietà\n" +
                                "Annoia la città\n" +
                                "E dalle feste private\n" +
                                "Si sente un oboe suonare\n" +
                                "\n" +
                                "Ingoio un rospo\n" +
                                "Ingoio un rospo\n" +
                                "\n" +
                                "Esperti all'opera\n" +
                                "Vigneti senza età\n" +
                                "E nelle stanze chiuse\n" +
                                "Si sente un organo vitale\n" +
                                "\n" +
                                "Ingoio un rospo\n" +
                                "Ingoio un rospo"));
                        arrayCanzoni.add(new Canzone("Luna","Dipingimi\n" +
                                "Distorto come un angelo anormale\n" +
                                "Che cade\n" +
                                "Offendimi\n" +
                                "Se odiare è un crimine\n" +
                                "Il prezzo è uguale\n" +
                                "E fa male\n" +
                                "\n" +
                                "E vedo te\n" +
                                "Io e te\n" +
                                "Niente\n" +
                                "Conta\n" +
                                "In fondo\n" +
                                "\n" +
                                "Illumina\n" +
                                "Annulla le paure oh luna\n" +
                                "Nulla\n" +
                                "È uguale\n" +
                                "Sarò così\n" +
                                "Onesto come se\n" +
                                "Tu fossi il mare\n" +
                                "Il mare\n" +
                                "\n" +
                                "E vedo te\n" +
                                "Io e te\n" +
                                "Niente\n" +
                                "Conta\n" +
                                "E crolla\n" +
                                "Crolla\n" +
                                "\n" +
                                "E vedo te\n" +
                                "Io e te\n" +
                                "Niente\n" +
                                "Conta\n" +
                                "In fondo"));
                        arrayCanzoni.add(new Canzone("Mina","Oh Mina\n" +
                                "Ho perso il controllo\n" +
                                "E dopo tutto non avrò che pioggia\n" +
                                "Che cade con me\n" +
                                "E getto le ultime molecole\n" +
                                "Contro\n" +
                                "Contro\n" +
                                "Contro di te\n" +
                                "\n" +
                                "E brucia\n" +
                                "Brucia con me\n" +
                                "L'aria\n" +
                                "E brucia\n" +
                                "Brucia con me\n" +
                                "L'aria\n" +
                                "\n" +
                                "Oh Mina\n" +
                                "Ferma e composta\n" +
                                "Getto le ultime molecole\n" +
                                "Contro\n" +
                                "Contro\n" +
                                "Contro di te\n" +
                                "\n" +
                                "E brucia\n" +
                                "Brucia con me\n" +
                                "L'aria\n" +
                                "E brucia\n" +
                                "Brucia con me\n" +
                                "L'aria"));
                        arrayCanzoni.add(new Canzone("Balanite","Sono steso su un cielo-fan\n" +
                                "Che opportunamente ho disteso per me\n" +
                                "Ora commentami un giorno\n" +
                                "Come non lo hai fatto mai\n" +
                                "Io lo spero ancora, ancora\n" +
                                "\n" +
                                "Spesso dormo su un cielo-fan\n" +
                                "Qui le cose sfuggono e non mi spiego perché\n" +
                                "Se puoi condensa il giorno\n" +
                                "Come non lo hai fatto mai\n" +
                                "E fa male ancora\n" +
                                "\n" +
                                "Eppure non stai per piangere\n" +
                                "Torna la libidine prima o poi\n" +
                                "Lo spero per te finta comodità\n" +
                                "Torna la libidine prima o poi\n" +
                                "\n" +
                                "Ho sonno e dormo un po' di più\n" +
                                "Perdo la lucidità ma la ritrovo sempre\n" +
                                "L'orrore scenico perde tutta la comicità\n" +
                                "Ed io mi chiedo perché\n" +
                                "\n" +
                                "Davvero non stai per piangere\n" +
                                "Torna la libidine prima o poi\n" +
                                "Lo spero per te finta comodità\n" +
                                "Torna la libidine prima o poi\n" +
                                "\n" +
                                "Ho sonno e dormo"));
                        arrayCanzoni.add(new Canzone("Phantastica","Racconto favole su di te\n" +
                                "Che ascolti così preziosamente\n" +
                                "Sei un fiore insano tu\n" +
                                "Che si guarda\n" +
                                "Con occhi porpora\n" +
                                "\n" +
                                "Correggimi se tutto questo è debole\n" +
                                "Quello che fai non crea più attenzione\n" +
                                "Non coinvolge\n" +
                                "\n" +
                                "Questo non è reale\n" +
                                "Confronto le idee ed accendo le stelle\n" +
                                "C'è un Cristo che sanguina\n" +
                                "E ci guarda con rabbia\n" +
                                "\n" +
                                "E come sai tu sei per me colpevole\n" +
                                "Quello che fai non crea più attenzione\n" +
                                "Non coinvolge\n" +
                                "\n" +
                                "L'aggressività non mi avrà\n" +
                                "Confonde le idee ed affetta la gente\n" +
                                "C'è un Dio che sanguina\n" +
                                "Che sanguina\n" +
                                "\n" +
                                "E credo di essere anormale\n" +
                                "Ebbene non lo so\n" +
                                "Mi vedi? Temi? Credi io ti userò?"));
                        arrayCanzoni.add(new Canzone("Elefante","Blu\n" +
                                "L'impero è blu\n" +
                                "È questo che mi manca\n" +
                                "E mi provoca\n" +
                                "Più\n" +
                                "Direi di più\n" +
                                "Della tua pelle in fumo\n" +
                                "Che mi soffoca\n" +
                                "\n" +
                                "Precipita la verità\n" +
                                "È solo un pò\n" +
                                "Più debole\n" +
                                "\n" +
                                "Giù\n" +
                                "Mi pare giù\n" +
                                "È come scura e gonfia\n" +
                                "La mia satira\n" +
                                "Uh\n" +
                                "L'impero è blu\n" +
                                "Questa è la cura in rima, ci soddisferà\n" +
                                "\n" +
                                "Precipita la verità\n" +
                                "È solo un pò\n" +
                                "Più debole\n" +
                                "\n" +
                                "Boom\n" +
                                "Mi sparo boom\n" +
                                "Se la mia pelle è in fumo\n" +
                                "La tua soffoca\n" +
                                "La tua soffoca, la tua soffoca"));
                        arrayCanzoni.add(new Canzone("Glamodrama","A volte lei cambia pelle\n" +
                                "E lo confessa a me\n" +
                                "Continuamente\n" +
                                "Lei esplora l'ordine diffuso da me\n" +
                                "Ed ora è chiaro che\n" +
                                "La carie più viva sei\n" +
                                "Solo tu\n" +
                                "\n" +
                                "Demone\n" +
                                "Demone\n" +
                                "Come cadi bene, un bolide!\n" +
                                "Diamine\n" +
                                "Demone\n" +
                                "L'ansia divora\n" +
                                "\n" +
                                "A volte\n" +
                                "Compaiono streghe\n" +
                                "La psicoanalisi\n" +
                                "Non funziona più come\n" +
                                "Io vorrei\n" +
                                "\n" +
                                "Demone\n" +
                                "Demone\n" +
                                "Come cadi bene, un bolide!\n" +
                                "Diamine\n" +
                                "Demone\n" +
                                "L'ansia divora\n" +
                                "\n" +
                                "La serpe\n" +
                                "Non cambia pelle\n" +
                                "E non è vero che\n" +
                                "La carie più viva resti\n" +
                                "Solo tu"));
                        arrayCanzoni.add(new Canzone("Far Fisa","Le innocue verità\n" +
                                "Congelano le labbra\n" +
                                "La gente lucida non pensa\n" +
                                "Più a niente\n" +
                                "Più a niente\n" +
                                "\n" +
                                "Sconvolge già\n" +
                                "La mia banalità\n" +
                                "A mente lucida non resta\n" +
                                "In mente\n" +
                                "In mente\n" +
                                "\n" +
                                "Nel niente, nel niente\n"));
                        arrayCanzoni.add(new Canzone("17 Tir Nel Cortile","Ho visto anche la neve sciogliersi di colpo e ora so, ti amo\n" +
                                "\n" +
                                "Ho chiesto fin troppo ed ora lo ammetto\n" +
                                "Mi asciugherò di colpo e poi sarò contento di nuovo\n" +
                                "\n" +
                                "Scolpiscono un cuore di piombo\n" +
                                "Ci sono cose che pesano, pesano, pesano\n" +
                                "Ci sono cose che schiacciano\n" +
                                "\n" +
                                "Oh no, cresco eppure m'abbasso\n" +
                                "Chilometri in giù, chilometri più giù, più giù\n" +
                                "\n" +
                                "Colpiscono un cuore di piombo\n" +
                                "Ci sono cose che pesano, pesano, pesano\n" +
                                "Ci sono cose che schiacciano\n" +
                                "Colpiscono un cuore di piombo\n" +
                                "Ci sono cose che pesano\n"));
                        arrayCanzoni.add(new Canzone("40 Secondi Di Niente","Qui\n" +
                                "Non c'è più calma\n" +
                                "Settembre\n" +
                                "Ci porterà via con sé e\n" +
                                "Come una roccia\n" +
                                "Che pende\n" +
                                "Avremo le stesse pretese\n" +
                                "Addosso a me e te\n" +
                                "\n" +
                                "Poi\n" +
                                "Ritorna l'alba\n" +
                                "Che vibra\n" +
                                "È solo che sei in me\n" +
                                "Come una roccia\n" +
                                "Per niente\n" +
                                "Avremo le stesse difese\n" +
                                "Addosso a me e te\n" +
                                "\n" +
                                "Topi blu\n" +
                                "Ballano\n" +
                                "Sull'oceano\n" +
                                "Nulla\n" +
                                "È più vero\n" +
                                "È più vero\n" +
                                "\n" +
                                "Qui\n" +
                                "Non c'è più calma\n" +
                                "Settembre\n" +
                                "Ci porterà via con sé\n" +
                                "Con sé\n" +
                                "\n" +
                                "Le nostre difese\n" +
                                "Sfidano la follia\n" +
                                "Che ormai non sa\n" +
                                "Di niente, niente, niente, niente"));
                        arrayCanzoni.add(new Canzone("Il Suicidio Del Samurai","Questa è una goccia\n" +
                                "Che evapora da sé\n" +
                                "Questa gioia che ci illude\n" +
                                "Avrà cura di noi\n" +
                                "\n" +
                                "Affondo in Nora\n" +
                                "Affondo in Nora\n" +
                                "Affondo in Nora\n" +
                                "\n" +
                                "Certo è che la fine\n" +
                                "La so distinguere\n" +
                                "Più di ogni tua rinuncia\n" +
                                "Che sa di polvere\n" +
                                "\n" +
                                "Affondo in Nora\n" +
                                "Affondo in Nora\n" +
                                "Affondo in Nora"));
                        break;
                    case 11:
                        arrayCanzoni.add(new Canzone("Luna","Dipingimi\n" +
                                "Distorto come un angelo anormale\n" +
                                "Che cade\n" +
                                "Offendimi\n" +
                                "Se odiare è un crimine\n" +
                                "Il prezzo è uguale\n" +
                                "E fa male\n" +
                                "\n" +
                                "E vedo te\n" +
                                "Io e te\n" +
                                "Niente\n" +
                                "Conta\n" +
                                "In fondo\n" +
                                "\n" +
                                "Illumina\n" +
                                "Annulla le paure oh luna\n" +
                                "Nulla\n" +
                                "È uguale\n" +
                                "Sarò così\n" +
                                "Onesto come se\n" +
                                "Tu fossi il mare\n" +
                                "Il mare\n" +
                                "\n" +
                                "E vedo te\n" +
                                "Io e te\n" +
                                "Niente\n" +
                                "Conta\n" +
                                "E crolla\n" +
                                "Crolla\n" +
                                "\n" +
                                "E vedo te\n" +
                                "Io e te\n" +
                                "Niente\n" +
                                "Conta\n" +
                                "In fondo\n"));
                        arrayCanzoni.add(new Canzone("Harvest (Neil Young Cover)","Did I see you down in a young girl's town\n" +
                                "With your mother in so much pain?\n" +
                                "I was almost there at the top of the stairs\n" +
                                "With her screamin' in the rain\n" +
                                "\n" +
                                "Did she wake you up to tell you that\n" +
                                "It was only a change of plan?\n" +
                                "Dream up, dream up, let me fill your cup\n" +
                                "With the promise of a man\n" +
                                "\n" +
                                "Did I see you walking with the boys\n" +
                                "Though it was not hand in hand?\n" +
                                "And was some black face in a lonely place\n" +
                                "When you could understand?\n" +
                                "\n" +
                                "Did she wake you up to tell you that\n" +
                                "It was only a change of plan?\n" +
                                "Dream up, dream up, let me fill your cup\n" +
                                "With the promise of a man\n" +
                                "\n" +
                                "Will I see you give more than I can take?\n" +
                                "Will I only harvest some?\n" +
                                "As the days fly past will we lose our grasp\n" +
                                "Or fuse it in the sun?\n" +
                                "\n" +
                                "Did she wake you up to tell you that\n" +
                                "It was only a change of plan?\n" +
                                "Dream up, dream up, let me fill your cup\n" +
                                "With the promise of a man\n" +
                                "\n" +
                                "Dream up, dream up, let me fill your cup\n" +
                                "With the promise of a man"));
                        arrayCanzoni.add(new Canzone("Le Tue Ossa Nell'altitudine","Ora le tue ossa si corrodono\n" +
                                "Eppure stai nell'aria\n" +
                                "E conta per me\n" +
                                "Un fiume di noi\n" +
                                "Che soffia di noia\n" +
                                "E ancora tutto è scorretto\n" +
                                "E t'immagino\n" +
                                "\n" +
                                "L'oceano fra noi, fra noi\n" +
                                "L'oceano fra noi\n" +
                                "Noi\n" +
                                "\n" +
                                "Woah, oh, oh, yeah\n" +
                                "Woah, oh, oh, yeah\n" +
                                "Woah, oh\n" +
                                "\n" +
                                "Dunque, le tue ossa si corrodono\n" +
                                "Eppure sei intatta\n" +
                                "Miracolo\n" +
                                "Un fiume di noi\n" +
                                "Esplode di gloria\n" +
                                "E anche se tutto è scorretto\n" +
                                "Adora, adorami"));
                        arrayCanzoni.add(new Canzone("Apice","Lei non è qua\n" +
                                "A parlar con me\n" +
                                "Questa è\n" +
                                "Abitudine\n" +
                                "\n" +
                                "C'è un mostro fra noi\n" +
                                "E non molla mai\n" +
                                "Controlla\n" +
                                "Ogni cosa\n" +
                                "Ogni cosa\n" +
                                "\n" +
                                "Lei non c'è mai\n" +
                                "Ma dorme con me\n" +
                                "Porta via\n" +
                                "Ogni colpa\n" +
                                "Ogni colpa\n" +
                                "\n" +
                                "C'è un demone\n" +
                                "Conversa con me\n" +
                                "Sfreccia su\n" +
                                "Fra le nuvole"));
                        arrayCanzoni.add(new Canzone("Omashee","[Strumentale]"));
                        break;
                    case 12:
                        arrayCanzoni.add(new Canzone("Marti In The Sky","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Don Calisto","In requiem\n" +
                                "È come in un fiume, lo vedi o no?\n" +
                                "Ora muoio\n" +
                                "Ho gli occhi chiusi, lo vedi o no? Sono infesto\n" +
                                "È come in un fiume, lo vedi o no?\n" +
                                "Doma il mostro\n" +
                                "È come in un fiume, lo vedi o no?\n" +
                                "\n" +
                                "Non sei più qui, sei più lontano\n" +
                                "E va bene così, bene co... lontano\n" +
                                "Ed io morirò, morirò di fame\n" +
                                "E alla fine tu m'illudi in laude\n" +
                                "\n" +
                                "Sono infesto\n" +
                                "È come in un fiume, lo vedi o no?\n" +
                                "\n" +
                                "Non sei più qui, sei più lontano\n" +
                                "E va bene così, bene co... normalo\n" +
                                "Ed io morirò, morirò di fame\n" +
                                "E alla fine tu m'illudi in laude\n" +
                                "\n" +
                                "In laude\n" +
                                "In laude\n" +
                                "In laude\n" +
                                "In laude"));
                        arrayCanzoni.add(new Canzone("Non Prendere l'Acme, Eugenio","In collera ho un grido, quanto è inutile\n" +
                                "Perdo energie e non so perché\n" +
                                "La spinta mi slancia, tutto è comodo\n" +
                                "Diglielo a Dio se sai che c'è\n" +
                                "Conoscono un posto e lì io mi guarirò\n" +
                                "Scompariranno i tempi bui\n" +
                                "Non vincerò più, il mondo è domino\n" +
                                "Diglielo a Dio se sai che c'è\n" +
                                "\n" +
                                "Il buio è qui, il buio è qui\n" +
                                "Non vedremo mai, vedremo mai\n" +
                                "Impazzirò in un attimo\n" +
                                "Un volo nel pus, un volo nel pus\n" +
                                "Non berremo mai, berremo mai\n" +
                                "Impazzirò\n" +
                                "\n" +
                                "Lo merito, lo merito\n" +
                                "Lo merito, lo merito\n" +
                                "Lo merito, lo merito\n" +
                                "Un volo nel pus\n" +
                                "\n" +
                                "In collera ho un grido, quanto è inutile\n" +
                                "Perdo energie, non so perché\n" +
                                "La spinta mi slancia, tutto è comodo\n" +
                                "Diglielo a Dio se sai che c'è\n" +
                                "\n" +
                                "Il buio è qui, il buio è qui\n" +
                                "Non vedremo mai, vedremo mai\n" +
                                "Impazzirò in un attimo\n" +
                                "Un volo, un volo, un volo nel pus\n" +
                                "\n" +
                                "In testa a Godzilla\n" +
                                "Fra le sue ciglia\n" +
                                "Non prendere l’acme\n" +
                                "Se sei un Hare Krishna\n" +
                                "Mi meraviglierai\n" +
                                "Non prendere l’acme\n" +
                                "Non prendere l’acme\n" +
                                "Non prendere l’acme\n" +
                                "Non prendere l’acme\n" +
                                "Non prendere l’acme\n" +
                                "Non prendere l’acme"));
                        arrayCanzoni.add(new Canzone("Angie","Prima o poi\n" +
                                "Mi sparerai alle spalle, Angie\n" +
                                "Credi in ciò che fai\n" +
                                "Senza lacrime\n" +
                                "Mi distruggerai\n" +
                                "Laverai\n" +
                                "Le tue mani rosse, Angie\n" +
                                "Scuro più che mai\n" +
                                "Senza lacrime\n" +
                                "Ti addormenterai\n" +
                                "\n" +
                                "Come mai\n" +
                                "Che ne sai, semmai\n" +
                                "Rido in lei, semmai\n" +
                                "Nei tuoi nei io mai\n" +
                                "Dio è gay\n" +
                                "\n" +
                                "Lunedì\n" +
                                "È il giorno delle streghe, Angie\n" +
                                "Sai come si fa\n" +
                                "Senza lacrime\n" +
                                "Mi distruggerai\n" +
                                "\n" +
                                "Oramai\n" +
                                "Che ne sai, semmai\n" +
                                "Rido in lei, semmai\n" +
                                "Nei tuoi nei io mai\n" +
                                "Dio è gay"));
                        arrayCanzoni.add(new Canzone("Aha","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Isacco Nucleare","Ho perso l'amore, ora so\n" +
                                "L'ho sparso sul suolo, ora so\n" +
                                "Se solo fossi qui parlerei di più\n" +
                                "È strano, è vero, ora so\n" +
                                "\n" +
                                "Pioggia sui fili, sono qui\n" +
                                "Nubi d'Isacco\n" +
                                "Le nubi d'Isacco\n" +
                                "Le nubi d'Isacco\n" +
                                "\n" +
                                "C'è un posto migliore, ora so\n" +
                                "Nell'arcobaleno, ora so\n" +
                                "Se solo fossi ricco prenderei di più\n" +
                                "Più forte si muore, ora so\n" +
                                "(entschuldigung)\n" +
                                "\n" +
                                "Pioggia sui fili, sono qui\n" +
                                "Nubi d'Isacco\n" +
                                "Le nubi d'Isacco\n" +
                                "Le nubi d'Isacco"));
                        arrayCanzoni.add(new Canzone("Caños","Peggio di noi\n" +
                                "Non si può stare, credimi\n" +
                                "L'alta marea\n" +
                                "Ci porterà via, credimi\n" +
                                "\n" +
                                "Tu mi assordi, come fai?\n" +
                                "Ti subirò\n" +
                                "Non torneremo più\n" +
                                "It's true\n" +
                                "\n" +
                                "Dicono che\n" +
                                "Tutto è sbagliato\n" +
                                "E parlano\n" +
                                "Lingue di bue\n" +
                                "Un pasto per due\n" +
                                "Parlami\n" +
                                "\n" +
                                "Tu mi asciugherai\n" +
                                "Giuro, lo fai\n" +
                                "Non torneremo più\n" +
                                "It's true\n" +
                                "\n" +
                                "Seven\n" +
                                "Seven\n" +
                                "È il numero\n" +
                                "Degli alberi\n" +
                                "Dio solo sa\n" +
                                "Se questa città\n" +
                                "Ha alberi\n" +
                                "\n" +
                                "Ma che importa\n" +
                                "Tu mi fai\n" +
                                "Mi brucerò\n" +
                                "Non torneremo più"));
                        arrayCanzoni.add(new Canzone("Il Gulliver","Non resisti e un po’ stai male\n" +
                                "Non parli più\n" +
                                "In fondo c’era poco da dire\n" +
                                "Non parlerai più\n" +
                                "Perfetto il giorno muore\n" +
                                "E non ridi più\n" +
                                "In fondo c’era poco da ridere\n" +
                                "Ti troverai nuda\n" +
                                "\n" +
                                "Non cresce più poesia\n" +
                                "\n" +
                                "Dio mi tiene giù\n" +
                                "Dio mi preme giù\n" +
                                "Eppure riuscirò\n" +
                                "Finchè c’eri tu\n" +
                                "Finchè c’eri tu dal buio riuscirò\n" +
                                "L’amore è oblio e annebbia gli occhi tuoi\n" +
                                "È assurdo ormai io annebbierò nei guai\n" +
                                "\n" +
                                "Non cresce più poesia\n" +
                                "\n" +
                                "E’ chiaro che sei fuori di me\n" +
                                "Macroonde\n" +
                                "Quando il mare era blu e il cielo era blu\n" +
                                "Macroonde\n" +
                                "Puoi fregare gli dei, fregare gli dei\n" +
                                "Macroonde\n" +
                                "Se mi amassi di più non temerei più\n" +
                                "Macroonde\n" +
                                "Resti immobile negli occhi miei\n" +
                                "Giuro immobile\n" +
                                "È come uno scivolo negli occhi miei\n" +
                                "Resti immobile\n" +
                                "È forse un nodo negli occhi miei\n" +
                                "Mi ritroverò\n" +
                                "Percorri lo scivolo negli occhi miei\n" +
                                "Io mi ritroverò\n" +
                                "\n" +
                                "Per fregare gli dei, fregare gli dei\n" +
                                "Macroonde\n" +
                                "Quando il radio era blu e il mare era blu\n" +
                                "Macroonde\n" +
                                "Per fregare gli dei, fregare gli dei\n" +
                                "Macroonde\n" +
                                "Se mi amassi di più non temerei più\n" +
                                "Macroonde"));
                        arrayCanzoni.add(new Canzone("Faro","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Muori Delay","Muori delay\n" +
                                "Ci si tuffa in lei\n" +
                                "Ominidee\n" +
                                "È la mia attitudine (chi se ne frega)\n" +
                                "Muori delay\n" +
                                "Trovi rifugio in lei\n" +
                                "È vero che\n" +
                                "Il nero è buio fondo\n" +
                                "\n" +
                                "Sento che durerà un po'\n" +
                                "Deriso dalla folla il clown\n" +
                                "Conto che durerà un po'\n" +
                                "Deriso dalla folla il clown\n" +
                                "Guardo la fine che fa\n" +
                                "Deriso dalla folla il clown\n" +
                                "Gonfio di numeri ormai\n" +
                                "Deriso dalla folla il clown\n" +
                                "\n" +
                                "Muori delay\n" +
                                "Ci provi un tuffo in lei\n" +
                                "È vero che\n" +
                                "Il nero è buio fondo\n" +
                                "\n" +
                                "Sento che durerà un po'\n" +
                                "Deluso dalla folla il clown\n" +
                                "Conto che durerà un po'\n" +
                                "Deluso dalla folla il clown\n" +
                                "Guardo la fine che fa\n" +
                                "Deluso dalla folla il clown\n" +
                                "Gonfio di numeri ormai\n" +
                                "Deluso dalla folla il clown"));
                        arrayCanzoni.add(new Canzone("Trovami Un Modo Semplice Per Uscirne","Non cresci più\n" +
                                "A tratti è normale\n" +
                                "E non si arrende più\n" +
                                "Il mio cuore\n" +
                                "\n" +
                                "Cosa ti resta\n" +
                                "Il folle ride e penso a lei\n" +
                                "Accorgersi\n" +
                                "Di vivere nell'estasi\n" +
                                "Cose che accadono qui\n" +
                                "Il paradiso è lei e non ho più rocce\n" +
                                "Leggere ormai\n" +
                                "My mind\n" +
                                "\n" +
                                "Come puoi vivere a testa in giù?\n" +
                                "Come puoi vivere a testa in giù?\n" +
                                "\n" +
                                "Veglia in un sogno\n" +
                                "Il paradiso è lei e non c'è più luce\n" +
                                "Per guardarci ormai\n" +
                                "Cieca\n" +
                                "Il buio sole disinfesta gli alberi\n" +
                                "Cadono al suolo\n" +
                                "\n" +
                                "Non riuscirò, se mi tiri giù\n" +
                                "Non riuscirò, non respiri più\n" +
                                "Non riuscirò, non riuscirò\n" +
                                "\n" +
                                "Come puoi vivere a testa in giù?\n" +
                                "Come puoi vivere a testa in giù?"));
                        arrayCanzoni.add(new Canzone("Opanopono","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Il Caos Strisciante","Credo di far\n" +
                                "Parte di un incubo\n" +
                                "Ora io so\n" +
                                "È lì che io sto\n" +
                                "Gonfio di lividi\n" +
                                "Come in un film\n" +
                                "Non cambierà mai\n" +
                                "Hare krishna\n" +
                                "\n" +
                                "Se te ne vai insisterò\n" +
                                "Se te ne vai ti spingerò\n" +
                                "Se te ne vai\n" +
                                "\n" +
                                "Miiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\n" +
                                "Miiiiiiiiiiiiiiiiii iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\n" +
                                "\n" +
                                "Credo di far\n" +
                                "Parte di un incubo\n" +
                                "Come in un film\n" +
                                "Per sempre nei guai\n" +
                                "Gonfio di lividi\n" +
                                "Come in un film\n" +
                                "Non cambierà mai"));
                        arrayCanzoni.add(new Canzone("Was?","Sono alle Hawaii e arrivi tu\n" +
                                "Dentro di me arrivi tu\n" +
                                "Tanto alla fine ciò che fai\n" +
                                "Credimi amore non basta mai\n" +
                                "Credimi amore non basta mai\n"));
                        arrayCanzoni.add(new Canzone("Sotto prescrizione del dott. Huxley","Sfiorirai\n" +
                                "Puoi perdere i chili che hai, ma\n" +
                                "Sfiorirai\n" +
                                "Scompari ma in fondo ci sei, poi\n" +
                                "Sfiorirai\n" +
                                "Puoi perderti a fondo se vuoi\n" +
                                "Fino a fondo se vuoi, ma\n" +
                                "Per me l'unica è farsi del male\n" +
                                "Che importa? Prima o poi\n" +
                                "Mi prenderai al volo\n" +
                                "\n" +
                                "Sfiorirai\n" +
                                "E riempirai i buchi fra noi, poi\n" +
                                "Ti curerai\n" +
                                "Puoi perderti a fondo se vuoi\n" +
                                "Fino a fondo se vuoi, ma\n" +
                                "Per me l'unica è farsi del male\n" +
                                "Che importa? Prima o poi\n" +
                                "Mi prenderai al volo\n" +
                                "\n" +
                                "Ma tu non sai come\n" +
                                "Tu non sai come\n" +
                                "Tu non sai come\n" +
                                "\n" +
                                "Dottore, ridammi euforia\n" +
                                "Se nuoto nel fango è solo colpa mia\n" +
                                "Sei fra le righe ma ti raggiungerò\n" +
                                "Ti muovi fra le dita, rimani per un po'\n" +
                                "\n" +
                                "Vivi nell'aria, tu così fai\n" +
                                "Vivi nell'aria, tu così fai\n" +
                                "\n" +
                                "A volte ci spero ancora un po'\n" +
                                "Ma tutto è a rovescio, dimmi come può\n" +
                                "Io sono l'hippy che fuma i giorni tuoi\n" +
                                "Puoi ridere con me, rimani solo un po'\n" +
                                "\n" +
                                "Vivi nell'aria, tu così fai\n" +
                                "Vivi nell'aria, tu così fai\n" +
                                "\n" +
                                "Vivi nell'aria\n" +
                                "Vivi nell'aria\n" +
                                "Vivi nell'aria"));
                        break;
                    case 13:
                        arrayCanzoni.add(new Canzone("Caños","Peggio di noi\n" +
                                "Non si può stare, credimi\n" +
                                "L'alta marea\n" +
                                "Ci porterà via, credimi\n" +
                                "\n" +
                                "Tu mi assordi, come fai?\n" +
                                "Ti subirò\n" +
                                "Non torneremo più\n" +
                                "It's true\n" +
                                "\n" +
                                "Dicono che\n" +
                                "Tutto è sbagliato\n" +
                                "E parlano\n" +
                                "Lingue di bue\n" +
                                "Un pasto per due\n" +
                                "Parlami\n" +
                                "\n" +
                                "Tu mi asciugherai\n" +
                                "Giuro, lo fai\n" +
                                "Non torneremo più\n" +
                                "It's true\n" +
                                "\n" +
                                "Seven\n" +
                                "Seven\n" +
                                "È il numero\n" +
                                "Degli alberi\n" +
                                "Dio solo sa\n" +
                                "Se questa città\n" +
                                "Ha alberi\n" +
                                "\n" +
                                "Ma che importa\n" +
                                "Tu mi fai\n" +
                                "Mi brucerò\n" +
                                "Non torneremo più"));
                        arrayCanzoni.add(new Canzone("Malaga","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("L'ora è buia","Tu non puoi\n" +
                                "Tu non lo fai\n" +
                                "Ma sei qui\n" +
                                "Oramai\n" +
                                "Sembri giù\n" +
                                "Vuoi di più\n" +
                                "Tu mi affliggerai!\n" +
                                "\n" +
                                "C'è uno squarcio su di lei\n" +
                                "Ora è tardi, io dovrei\n" +
                                "In un bar\n" +
                                "Fra di noi\n" +
                                "Ti convincerò!\n" +
                                "\n" +
                                "Non sei più\n" +
                                "Non sarai mai\n" +
                                "Come vuoi\n" +
                                "Tu lo sai\n" +
                                "Nulla in più\n" +
                                "D'ora in poi\n" +
                                "Tu mi affliggerai!\n" +
                                "\n" +
                                "C'è uno squarcio su di lei\n" +
                                "Ora e sempre io dovrei\n" +
                                "In un bar\n" +
                                "Fra di noi\n" +
                                "Ti convincerò!\n" +
                                "\n" +
                                "Come è buia\n" +
                                "L'ora è buia\n" +
                                "Sarà dura\n" +
                                "L'ora è buia\n" +
                                "È buia\n" +
                                "\n" +
                                "Tu non puoi\n" +
                                "Tu non lo fai\n" +
                                "Ma sei qui\n" +
                                "Oramai\n" +
                                "Sembri giù\n" +
                                "Vuoi di più\n" +
                                "Tu non fingerai\n" +
                                "\n" +
                                "C'è uno squarcio su di lei\n" +
                                "Ora e sempre io dovrei\n" +
                                "In un bar\n" +
                                "Fra di noi\n" +
                                "Ti convincerò\n" +
                                "Ti convincerò"));
                        arrayCanzoni.add(new Canzone("Párabellium","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("His latest flame (Marie's the name)","A very old friend came by today\n" +
                                "Because he was telling everyone in town\n" +
                                "About the love that he just found\n" +
                                "And Marie's the name of his latest flame\n" +
                                "\n" +
                                "Though I smiled the tears inside were a-burning\n" +
                                "I wished him luck and then he said goodbye\n" +
                                "He was gone but still his words kept returning\n" +
                                "What else was there for me to do but cry\n" +
                                "\n" +
                                "He talked and talked and I heard him say\n" +
                                "That she had the longest blackest hair\n" +
                                "The prettiest green eyes anywhere\n" +
                                "And Marie's the name of his latest flame\n" +
                                "\n" +
                                "Would you believe that yesterday\n" +
                                "This girl was in my arms and swore to me\n" +
                                "She'd be mine eternally\n" +
                                "And Marie's the name of his latest flame"));
                        arrayCanzoni.add(new Canzone("Fluido","Paradiso enorme\nNessuno può capirmi più\nE non so darmi più risposte\nGesù\n\nAl buio il fiume non c'è\nIl fiume al buio non si vede\nIncolla i fiori nella sabbia\nGesù\nGesù\nGesù\nGesù\n\nOra è meglio, ora nuoto\nSicuramente come non crederai\nAh, ah"));
                        break;
                    case 14:
                        arrayCanzoni.add(new Canzone("Scegli me (Un mondo che tu non vuoi)",""));
                        arrayCanzoni.add(new Canzone("Loniterp",""));
                        arrayCanzoni.add(new Canzone("Per sbaglio",""));
                        arrayCanzoni.add(new Canzone("Mi coltivo",""));
                        arrayCanzoni.add(new Canzone("Razzi arpia inferno e fiamme",""));
                        arrayCanzoni.add(new Canzone("Adoratorio","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Miglioramento",""));
                        arrayCanzoni.add(new Canzone("Il nulla di O.",""));
                        arrayCanzoni.add(new Canzone("Lui gareggia",""));
                        arrayCanzoni.add(new Canzone("Le scarpe volanti",""));
                        arrayCanzoni.add(new Canzone("Castelli per aria",""));
                        arrayCanzoni.add(new Canzone("Sorriso in spiaggia pt. 1",""));
                        arrayCanzoni.add(new Canzone("Sorriso in spiaggia pt. 2",""));
                        arrayCanzoni.add(new Canzone("Attonito",""));
                        arrayCanzoni.add(new Canzone("È solo lunedì",""));
                        arrayCanzoni.add(new Canzone("Tu e me",""));
                        arrayCanzoni.add(new Canzone("Badea blues",""));
                        arrayCanzoni.add(new Canzone("Nuova luce",""));
                        arrayCanzoni.add(new Canzone("Grattacielo",""));
                        arrayCanzoni.add(new Canzone("A Capella","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Rossella roll over",""));
                        arrayCanzoni.add(new Canzone("Canzone ostinata",""));
                        arrayCanzoni.add(new Canzone("12,5 mg","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Sul ciglio",""));
                        arrayCanzoni.add(new Canzone("Letto di mosche",""));
                        arrayCanzoni.add(new Canzone("La volta","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Lei disse (Un mondo del tutto differente)",""));
                        break;
                    case 15:
                        arrayCanzoni.add(new Canzone("Rossella Roll Over (Live)","Uh uh oh\n" +
                                "Quand'ero giovane, era tutto diverso\n" +
                                "Lo sai Rossella\n" +
                                "Novità valide non ne ho\n" +
                                "Se solo capissi\n" +
                                "Te ne vai Rossella, lontano da me\n" +
                                "Uh uh\n" +
                                "Proprio come tu vuoi, uh uh uh\n" +
                                "Vuoi, uh uh uh\n" +
                                "\n" +
                                "Tu mi hai, io lo so\n" +
                                "Credi in me, credi in noi\n" +
                                "Credi in ciò che vuoi\n" +
                                "Vivi nelle fiamme, ehi\n" +
                                "Tu, tururu, tururu, turururururu\n" +
                                "Turu, turu, tururu\n" +
                                "\n" +
                                "Cipressi e molotov\n" +
                                "È peggio dire no\n" +
                                "Vagherai Rossella, lontano da me, uh uh\n" +
                                "Lontano da me, uhuh\n" +
                                "Lontano da me. uhuh\n" +
                                "Lontano da me, uhuh\n" +
                                "\n" +
                                "Fai ciò che credi qui\n" +
                                "Se sai di vincere\n" +
                                "Senza limiti\n" +
                                "Se sai di vincere\n" +
                                "Se sai di vincere\n" +
                                "Oh, se sai di vincere\n" +
                                "\n" +
                                "Prendi e vai Rossella, lontano da me, uh ah\n" +
                                "Proprio come tu vuoi\n" +
                                "\n" +
                                "Questa è la canzone dei mostri\n"));
                        arrayCanzoni.add(new Canzone("Le Scarpe Volanti (Live)","È come pensavo, di ridere non smetterò\n" +
                                "In questa guerra che vincere io non potrò\n" +
                                "Credimi, è dura, ma rido\n" +
                                "\n" +
                                "Se fossi qui con me ti ascolterei\n" +
                                "E non dirmi è poco o niente\n" +
                                "Credimi, è dura\n" +
                                "E al sicuro sarò, solo senza lei\n" +
                                "Lei, uuh\n" +
                                "\n" +
                                "Io non ho più, non ho parole\n" +
                                "Io non ho che lacrime\n" +
                                "Io non ho più\n" +
                                "\n" +
                                "Non pensi sia un rischio\n" +
                                "Eliminarsi ancora un po'\n" +
                                "In questa battaglia che vincere io non potrò\n" +
                                "Ro-be-rta, Ro-be-rta\n" +
                                "Ro-be-rta, Ro-be-rta\n" +
                                "\n" +
                                "Polka e giudei, fai felice chi sei\n" +
                                "Fare il clown non dà risultati\n" +
                                "E forse cambiare dovrei\n" +
                                "Cosa non ti farei che tu non sai\n" +
                                "Fermerò anche uno yacht\n" +
                                "Perché un mare di nebbia è quello che ho"));
                        arrayCanzoni.add(new Canzone("È solo lunedì (Live)","No, nessuno sa che\n" +
                                "Io vivrò senza di lei\n" +
                                "Sì, io vivrò, uh\n" +
                                "\n" +
                                "Sta, sta ancora su ma\n" +
                                "I però costringono i guai\n" +
                                "Io lo so, dudu, dududu\n" +
                                "Dududu\n" +
                                "Du dududu, dududu, du dududu\n" +
                                "Dudu, du\n" +
                                "\n" +
                                "Cosa fare adesso?\n" +
                                "È inutile, l'idea solo male farà\n" +
                                "È solo lunedì nella mia mente, nella mente, uhuh\n" +
                                "È solo lunedì, uhuhuh ah ah\n" +
                                "Uhuhuh, uhuh, uhuhuh, ah\n" +
                                "Uhuhuh, uhuh, uhuhuh, uhuhuhuhuh, ah\n" +
                                "\n" +
                                "No, nessuno sa che\n" +
                                "Io vivrò senza di lei\n" +
                                "Sì, io vivrò\n" +
                                "\n" +
                                "Uhuhuhuh uh, yeah\n" +
                                "Uhuhuhuh uh, yeah\n" +
                                "Uhuhuhuh uh, yeah\n" +
                                "Uhuhuhuh uh, yeah\n" +
                                "Uhuhuhuh uh, yeah\n" +
                                "Uhuhuhuh uh, yeah, ohoh\n" +
                                "Uhuhuhuh uh, yeah, ohoh\n" +
                                "Uhuhuhuh uh, yeah\n" +
                                "Lalalalala du, uh ah yeah\n" +
                                "Uhuh, uhuhuh\n" +
                                "Uhuh, yey uh\n" +
                                "Uhuh, uhuhuh, ah\n" +
                                "Tu, tu, tu, tu tu tu\n" +
                                "Tu, tu, tu tu tu\n" +
                                "Tu, tu, tu tu tu\n" +
                                "Tu, tu, tu tu tu\n" +
                                "Tu, tu, tu tu tu\n" +
                                "Tu, tu, tu tu\n" +
                                "Tu, tu, tu tu\n" +
                                "Wow ihihihihih\n" +
                                "Ya ihihihih, wow\n" +
                                "Ya ihihihih, wow\n" +
                                "Ya ihohuhuh, wow\n" +
                                "Ya ihihihih, bowowowowowow"));
                        arrayCanzoni.add(new Canzone("Segale cornuta","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Inutilniente","Guardo lei, lei non sa\n" +
                                "Guardo lei, lei non sa\n" +
                                "Lei non sa\n" +
                                "Guardo lei, lei non sa\n" +
                                "Lei non sa\n" +
                                "\n" +
                                "Guardo lei, scopro che\n" +
                                "Solo lei\n" +
                                "Guardo lei\n" +
                                "Guardo lei, ancora così\n" +
                                "Mi rifugerò nei suoi blue jeans\n" +
                                "Solo lei, paura dovrò\n" +
                                "In quello che ho, che niente so\n" +
                                "E niente\n" +
                                "Ah, ah"));
                        arrayCanzoni.add(new Canzone("Baby I Love You","Lyrics for this song have yet to be released"));
                        arrayCanzoni.add(new Canzone("Optical (Demo)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("A capello (Demo)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Razzi arpia inferno e fiamme (alternative version)","Non vivo in me\n" +
                                "Non so chi sei\n" +
                                "Denti per tre io non ho più\n" +
                                "Mi acciglierò\n" +
                                "\n" +
                                "Dosi mai più, rimani giù\n" +
                                "Forse a Gesù non crederei\n" +
                                "Se fosse qua\n" +
                                "L'inferno in me\n" +
                                "Va in fiamme ormai\n" +
                                "\n" +
                                "Razzi, arpie, danni miei\n" +
                                "Più che mai danni miei\n" +
                                "Pause nel tempo riavrai\n" +
                                "Mentre la mente è in orbita\n"));
                        arrayCanzoni.add(new Canzone("Razzi arpia inferno e fiamme (Aucan remix)","Non vivo in me\n" +
                                "Non so chi sei\n" +
                                "Denti per tre io non ho più\n" +
                                "Mi acciglierò\n" +
                                "\n" +
                                "Dosi mai più, rimani giù\n" +
                                "Forse a Gesù non crederei\n" +
                                "Se fosse qua\n" +
                                "L'inferno in me\n" +
                                "Va in fiamme ormai\n" +
                                "\n" +
                                "Razzi, arpie, danni miei\n" +
                                "Più che mai danni miei\n" +
                                "Pause nel tempo riavrai\n" +
                                "Mentre la mente è in orbita"));
                        break;
                    case 16:
                        arrayCanzoni.add(new Canzone("Ho Una Fissa","Svieni fra noi\n" +
                                "Stipula un'idea\n" +
                                "Non sai che al buio sarò\n" +
                                "Vedi che sai\n" +
                                "Sorridere anche agli Dei\n" +
                                "E sai che illudere può\n" +
                                "Svieni se puoi\n" +
                                "Chiediti cos'hai\n" +
                                "Ci aspetta il buio però\n" +
                                "Credi di star qui\n" +
                                "Sorridi senza ragione\n" +
                                "E sai che uccidere può\n" +
                                "\n" +
                                "Già, uccidere può\n" +
                                "Ma dissanguare non so\n" +
                                "Di certo uccidere può\n" +
                                "Ed aspettare non so\n" +
                                "\n" +
                                "Svieni fra noi\n" +
                                "Stipula un’idea\n" +
                                "Non sai che al buio sarò\n" +
                                "Vedi che sai\n" +
                                "Sorridere anche agli Dei\n" +
                                "E sai che illudere può, sai che illudere può\n" +
                                "\n" +
                                "Già, illudere può\n" +
                                "Ed aspettare non so\n" +
                                "Di certo illudere, di certo uccidere\n" +
                                "Ed aspettare non so"));
                        arrayCanzoni.add(new Canzone("Puzzle","T'investirò\n" +
                                "Eh si che ho perso ogni merito\n" +
                                "Mi includerai mai\n" +
                                "Nell'inferno in cui vivi tu\n" +
                                "Sei fumo o hashish? Benzina o cenere?\n" +
                                "M'includerai mai?\n" +
                                "\n" +
                                "Oh oh mi serve un sì\n" +
                                "Oh oh tu dimmi dove sei\n" +
                                "Oh oh...\n" +
                                "\n" +
                                "Ti siedi qui un po'\n" +
                                "Eh si che hai perso ogni livido\n" +
                                "Ti prude oramai\n" +
                                "Vai di fretta e non vivi più\n" +
                                "La slot machine pensi sia un demone\n" +
                                "M'includerai mai?\n" +
                                "\n" +
                                "Oh oh mi serve un sì\n" +
                                "È solo un mare nero\n" +
                                "Che annullerà qualsiasi no, no\n" +
                                "È solo un mare nero\n" +
                                "Come s'infuria in me\n" +
                                "\n" +
                                "Chiamami Nevruz\n" +
                                "Raccogli il mio seme\n" +
                                "E lo giuro che un timone c'hai\n" +
                                "Lo fa chi ci crede\n" +
                                "E lo tieni da chilometri\n" +
                                "Ma è l'amore che lo muove, sai?\n" +
                                "Efedrina, efredina\n" +
                                "\n" +
                                "Poi ti siedi qui, Carol ma sì\n" +
                                "Già ti senti nuda un po'\n" +
                                "E riammettimi, dai, fra i tuoi demoni\n" +
                                "E iniettami aria\n" +
                                "Troverai l'energie\n" +
                                "Iniettami aria\n" +
                                "\n" +
                                "Se sogni è meglio poi\n" +
                                "Che nulla ti tiene qui"));
                        arrayCanzoni.add(new Canzone("Un Po’ Esageri","Come la pensai\n" +
                                "È un casino ormai e tu sai\n" +
                                "Non fai miracoli\n" +
                                "\n" +
                                "Vola in alto e poi\n" +
                                "Provaci se puoi e tu mai\n" +
                                "Lo sai che esageri\n" +
                                "Forse esageri\n" +
                                "\n" +
                                "Se ti mancherò\n" +
                                "Prova a fuggire in noi\n" +
                                "Ti sentirai identico\n" +
                                "\n" +
                                "Tornerai per me\n" +
                                "Provami che sei dentro ormai\n" +
                                "Tu prova a muovermi\n" +
                                "\n" +
                                "Tornerai per noi\n" +
                                "Ora si che puoi e tu sai\n" +
                                "Che è ciò che meriti\n" +
                                "Che è ciò che meriti\n" +
                                "\n" +
                                "Se ti mancherò\n" +
                                "Prova a fuggire in noi\n" +
                                "Ti sentirai identico\n" +
                                "\n" +
                                "Stai sulle rocce\n" +
                                "Ti ferirai\n" +
                                "So che vivi a volte\n" +
                                "Ti ferirai\n" +
                                "Forse più dei tuoi\n" +
                                "Ti ferirai\n" +
                                "\n" +
                                "Come la pensai\n" +
                                "Ora si che puoi\n" +
                                "Tu ci arriverai ed io mai\n" +
                                "Non fai miracoli\n" +
                                "E forse esageri\n" +
                                "Ma è ciò che meriti\n" +
                                "\n" +
                                "Stai sulle rocce\n" +
                                "Ti ferirai\n" +
                                "So che vivi a volte\n" +
                                "Ti ferirai"));
                        arrayCanzoni.add(new Canzone("Sci desertico","Non ci puoi restare fermo mai\n" +
                                "Dici che non siamo comodi\n" +
                                "Come ieri ancora tu ci sei\n" +
                                "Cosa dire adesso chiamami\n" +
                                "Più ti vedo e più sei fuori in me\n" +
                                "Più del mare in fondo perdo un che\n" +
                                "Ma non trovo via di fuga\n" +
                                "\n" +
                                "Oooh\n" +
                                "E sci desertico\n" +
                                "Sci desertico\n" +
                                "\n" +
                                "Devi dirlo ai tuoi\n" +
                                "Non sò se puoi\n" +
                                "Devi farlo bimba credimi\n" +
                                "Poi tu mi siedi\n" +
                                "Io coltivo il peso\n" +
                                "Sopra le tue mani come farei, come?\n" +
                                "\n" +
                                "E sto qui, sai che c'è? mai lo vorrei\n" +
                                "Mai lo vorrei, mai lo vorrei\n" +
                                "\n" +
                                "Che cos’hai?\n" +
                                "Se stiamo uniti, sai, davvero si può\n" +
                                "Branco nel blu\n" +
                                "Per ore cadrai\n" +
                                "E in paradiso sai nemmeno si può\n" +
                                "\n" +
                                "Uuhhh yeah\n" +
                                "Tu puoi dimostrare che\n" +
                                "Solo qui risalirò\n" +
                                "Ogni giorno che vorrai\n" +
                                "Credimi ci proverò\n" +
                                "Voglio dimostrare che\n" +
                                "\n" +
                                "Oh no\n" +
                                "Che a sci desertico\n" +
                                "Ci si diverte\n" +
                                "A sci desertico\n" +
                                "Ci si diverte, ci si diverte, ci si diverte, ci si diverte\n" +
                                "Uuuuh ehi uuuuh ehi"));
                        arrayCanzoni.add(new Canzone("Nevischio","Io non so perchè\n" +
                                "Ma ti muovi dentro me\n" +
                                "E non so se tornerai\n" +
                                "Io non credo cambierai\n" +
                                "\n" +
                                "E non sai di gelosia\n" +
                                "Nella mia mente sei comunque mia\n" +
                                "Faccio come il nevischio lo sai\n" +
                                "Avermi non potrai\n" +
                                "\n" +
                                "Non cambierò mai di stile\n" +
                                "Non mi vedrai come adesso affondare\n" +
                                "Nel terreno che circonda il tuo viale\n" +
                                "Già, puoi restare senza\n" +
                                "Puoi restare senza\n" +
                                "\n" +
                                "Scoppiare potrei\n" +
                                "Noi insieme così\n" +
                                "Non c'è distinzione vedi\n" +
                                "Sognare potrei\n" +
                                "Io ci spero tu si\n" +
                                "\n" +
                                "Prova il vento a muoverci\n" +
                                "Finchè ci muove il pensiero tuo sale\n" +
                                "Non è più ieri e tu non ci stare\n" +
                                "\n" +
                                "Mi dirai che senza un fine non ci riesco a stare\n" +
                                "Mi dirai che senza un fine non ci riesco a stare\n" +
                                "Senza un fine non ci riesco a stare\n"));
                        arrayCanzoni.add(new Canzone("Rilievo","Anima in pena\n" +
                                "Sudi davvero\n" +
                                "Giurami che sei\n" +
                                "Ogni mio pensiero\n" +
                                "Sola riuscirai\n" +
                                "Già nel vento stai\n" +
                                "Fai stretching, muovimi!\n" +
                                "\n" +
                                "Capterò bisogni immobili\n" +
                                "Più distante sarò\n" +
                                "E tu lo sai non serve mai\n" +
                                "Ci resti in me\n" +
                                "Bene anche senza lacrime\n" +
                                "Cos’è rimasto in più\n" +
                                "Se navighiamo all’ingiù\n" +
                                "Cos’hai da ieri non so\n" +
                                "\n" +
                                "Amami appena\n" +
                                "Sdraia il mio ego\n" +
                                "Vivere in fondo\n" +
                                "Sai non pare vero\n" +
                                "Sola riuscirai\n" +
                                "Dove tu non sai\n" +
                                "Fai stretching, muoviti!\n" +
                                "Fai stretching, muoviti!\n" +
                                "Fai stretching, muoviti!\n" +
                                "\n" +
                                "(mio per sempre)\n" +
                                "\n" +
                                "E' normale tu mi estorci\n" +
                                "Sai che gioire fa\n" +
                                "E non vedi più perchè io so\n" +
                                "Che non hai più eroi\n" +
                                "E non hai più rispetto sai\n" +
                                "Già ti ostini però\n" +
                                "Mai più nè si, nè no\n" +
                                "Lo giuro ho un mantra in me\n" +
                                "Lo giuro ho un mantra in me"));
                        arrayCanzoni.add(new Canzone("Diluvio","Di nuovo scompaio se te ne vai\n" +
                                "Insieme noi siamo pari\n" +
                                "Su di noi non crescerà un mai\n" +
                                "Tu resti in me\n" +
                                "È come una cicatrice\n" +
                                "Che un brivido è già\n" +
                                "Che un brivido è già\n" +
                                "\n" +
                                "Yeah, one two three (baby)\n" +
                                "\n" +
                                "Come litio baby\n" +
                                "Come litio baby\n" +
                                "\n" +
                                "Dormi un altro po’\n" +
                                "Sognerai che sei nel mio cuor\n" +
                                "\n" +
                                "Domo un mai\n" +
                                "Dissolvo un che\n" +
                                "Ormai mi aspetti lì\n" +
                                "Giù in un canyon\n" +
                                "C’è un vento gelido\n" +
                                "Che annienta il panico\n" +
                                "\n" +
                                "Di nuovo scompaio se te ne vai\n" +
                                "Insieme noi siamo pari\n" +
                                "Ho un brivido di già\n" +
                                "Ho un brivido di già\n" +
                                "Yeah yeah yeah"));
                        arrayCanzoni.add(new Canzone("Derek","Vera tu\n" +
                                "Tornerai mai più?\n" +
                                "A stare con me\n" +
                                "Senza non potrei\n" +
                                "E se ridi nel caos\n" +
                                "Menti e non lo sai\n" +
                                "E fuggire davvero\n" +
                                "Lo sai che non si può\n" +
                                "\n" +
                                "Vera tu, tornerai mai più?\n" +
                                "Scheletro sarò\n" +
                                "Chi se ne vanta?\n" +
                                "E ho mille ieri\n" +
                                "Feste in blue ray\n" +
                                "Diglielo se puoi\n" +
                                "Sei fuori onda\n" +
                                "Sei fuori onda\n" +
                                "\n" +
                                "Derek\n" +
                                "Che faccio? mollo il cash?\n" +
                                "E rimpianti non avrei\n" +
                                "Derek\n" +
                                "Mai ti raggiungerò\n" +
                                "Tu mi ami o no?\n" +
                                "Derek turururu\n" +
                                "\n" +
                                "Vera tu\n" +
                                "Tornerai mai più\n" +
                                "A giocare con me\n" +
                                "Senza non potrei\n" +
                                "Ma tu ridi nel caos\n" +
                                "Menti e non lo sai\n" +
                                "Che devi ridere ancora\n" +
                                "Anche se non si può più\n" +
                                "\n" +
                                "Prega con me\n" +
                                "Non vedi bene perché\n" +
                                "Hai perso ogni ciò che hai\n" +
                                "Prega in un mouse\n" +
                                "A pezzi giuro siamo fi gli tuoi\n" +
                                "Chiedi chi è\n" +
                                "A pezzi giuro non si ride mai\n" +
                                "Ti mancherei\n" +
                                "\n" +
                                "Derek\n" +
                                "Che faccio? mollo il cash?\n" +
                                "E rimpianti non avrei\n" +
                                "Derek\n" +
                                "Mai ti raggiungerò\n" +
                                "Tu mi ami o no?\n" +
                                "Derek turururu"));
                        arrayCanzoni.add(new Canzone("Vivere Di Conseguenza","Insieme a chi?\n" +
                                "Tu già mi agiti\n" +
                                "Immergersi\n" +
                                "Non provi un che\n" +
                                "Dove sei?\n" +
                                "Non correre ai ripari\n" +
                                "\n" +
                                "Su, sveglia!\n" +
                                "Ci vuole un gin\n" +
                                "Altro sarai\n" +
                                "Se capiti qui\n" +
                                "Più di un mostro\n" +
                                "E non ciò che vuoi\n" +
                                "Vivi e non basta\n" +
                                "\n" +
                                "E' panico restio\n" +
                                "E cambio umore anch’io yeeehhh\n" +
                                "Ma se ti rialzerai\n" +
                                "Di nuovo, si, vedrai yeeehhh\n" +
                                "\n" +
                                "Tu un po’ mi agiti\n" +
                                "Sono vivo o è un sogno?\n" +
                                "Non ne ho bisogno più, sai ooh\n" +
                                "Ma vivo di conseguenza\n" +
                                "E non certo è sempre quello che vuoi\n" +
                                "È salomonico\n" +
                                "\n" +
                                "Ieri verrà\n" +
                                "Calibra le mani e spinge in là\n" +
                                "Senza andare avanti\n" +
                                "Nomade essere\n" +
                                "Frena le tue mani, si, ma che fai?\n" +
                                "E se vuoi amarmi, se vuoi amarmi, se vuoi amarmi\n" +
                                "Ooh non eri qui invano\n" +
                                "Credimi non è così che ti voglio\n" +
                                "Che ci rimane?\n" +
                                "Eh si che mi rincresce\n"));
                        arrayCanzoni.add(new Canzone("Alieni Fra Di Noi","Quello fra noi cos’è?\n" +
                                "Vivere negli occhi sai non serve in sè\n" +
                                "Provaci a testa in giù\n" +
                                "Che riattiva il sangue poi\n" +
                                "Che c’è da ridere\n" +
                                "Agire non so\n" +
                                "\n" +
                                "Forse una pietra è già\n" +
                                "Vive come sempre fa, non smette mai\n" +
                                "Provaci anch’io vorrei\n" +
                                "Ma è la fine e non potrei\n" +
                                "Alieni fra di noi\n" +
                                "Agire non so, agire non so, agire non so, agire non so\n" +
                                "\n" +
                                "Scomponi quel che sei\n" +
                                "Vivi come sempre fai e non senti che\n" +
                                "È solo un miraggio in più\n" +
                                "Gettami nel fango e poi\n" +
                                "Non c’è da ridere\n" +
                                "Agire non so\n"));
                        arrayCanzoni.add(new Canzone("Contro La Ragione","Mi segnerò un gol\n" +
                                "Bene non prende\n" +
                                "Dagli un attimo e poi\n" +
                                "Vedrai che scende\n" +
                                "La sera che arriva\n" +
                                "Di nuovo esploderà\n" +
                                "Ed in fondo anch’io svanirò\n" +
                                "Sarà incredibile\n" +
                                "\n" +
                                "Come dei passi\n" +
                                "Fuori di qui\n" +
                                "È un mondo assassino per noi\n" +
                                "Contro la ragione\n" +
                                "E chi mal fa\n" +
                                "Stasera non è qui\n" +
                                "Ed in fondo anch’io svanirò\n" +
                                "Sarò invisibile\n" +
                                "Come il polline\n" +
                                "\n" +
                                "Solo il blu si muove in me\n" +
                                "E trova un modo in me\n" +
                                "\n" +
                                "Nei sogni andremo dove non sai\n" +
                                "Di sera invece faccio fuori il vile\n" +
                                "Mi sveglio al suolo con ferocia e poi\n" +
                                "Al peggio credi non si sopravvive, vive\n" +
                                "\n" +
                                "Non mi serve\n" +
                                "Ma se sogno un film\n" +
                                "Ci resto, ci resto\n" +
                                "Ed in fondo anch’io svanirò\n" +
                                "E andremo ancora in là"));
                        arrayCanzoni.add(new Canzone("Inno Del Perdersi","Hai più sonno o troppe rughe c’hai\n" +
                                "Non sei un poser\n" +
                                "Collabori\n" +
                                "Correrai dei rischi sai\n" +
                                "Nel sole che prendi\n" +
                                "Cosa sei che non sei mai?\n" +
                                "Sei spessa nell’anima, nell’anima\n" +
                                "\n" +
                                "È in su che sparirei\n" +
                                "Non dentro in me\n" +
                                "Che orrore consolami come sai\n" +
                                "Ma è un mai che dai\n" +
                                "Tu ne hai idea\n" +
                                "\n" +
                                "Bevi poi\n" +
                                "Che il vento asciuga\n" +
                                "E non sei di stoffa più\n" +
                                "Ma sei viva\n" +
                                "E sei nuda\n" +
                                "Così\n" +
                                "\n" +
                                "Oh no, tu dimentichi\n" +
                                "Stai mai così?\n" +
                                "Troverai gli Dei\n" +
                                "Su una stella dormi\n" +
                                "Serve coraggio in più\n" +
                                "\n" +
                                "Troverai in me ciò che non sei, sei\n" +
                                "Cos’ho che non va in me che non fermo più ?\n" +
                                "\n" +
                                "E irradia su di noi\n" +
                                "Ma perché?\n" +
                                "Perchè no, tu non sei come un fiume che brulica, no!\n" +
                                "Nessuna gloria\n" +
                                "Nessuna furia"));
                        arrayCanzoni.add(new Canzone("Funeralus","S'instaurerà sopra di noi\n" +
                                "Cosa vuoi di peggio?\n" +
                                "Niente panico\n" +
                                "Mi vedrò riflesso\n" +
                                "Di sera sai che c'è?\n" +
                                "Viene giù l’immenso\n" +
                                "Il nero e i sogni tuoi\n" +
                                "\n" +
                                "Non credermi\n" +
                                "Se mai dirò\n" +
                                "Che tu ancora sai\n" +
                                "Dire solo no\n" +
                                "Non sei un limite\n" +
                                "Proverò a rimuoverti\n" +
                                "\n" +
                                "Le mani prendimi\n" +
                                "Dimentica e poi\n" +
                                "Estendi il tuo cuore\n" +
                                "Dimentica e poi\n" +
                                "(Sei a un passo dal mare) e passa il confine\n" +
                                "(A un passo dal mare, a un passo dal male)\n" +
                                "\n" +
                                "Si muove a tratti\n" +
                                "Nell’universo\n" +
                                "Voglia di radersi\n" +
                                "Tu ne sai\n" +
                                "Ti prego divorami\n" +
                                "Non è strano\n" +
                                "Per noi\n" +
                                "Per noi\n"));
                        break;
                    case 17:
                        arrayCanzoni.add(new Canzone("Cannibale","Tu Simona lo sai\n" +
                                "Non risorgerai mai\n" +
                                "Magari\n" +
                                "Un oceano lo troverai\n" +
                                "Che frenesia\n" +
                                "Non sento fatica in me\n" +
                                "Piove e ritrovo gli Dei\n" +
                                "Credo che illuminerò\n" +
                                "Ho un fuoco dentro sai\n" +
                                "Che asciuga le lacrime\n" +
                                "E fuggire da qui potrei\n" +
                                "\n" +
                                "Consolami e non farmi male\n" +
                                "Consumerai ciò che rimane\n" +
                                "\n" +
                                "E scoprirai che è un mondo lontano\n" +
                                "Stendi il mio di nuovo al suolo\n" +
                                "\n" +
                                "Consolami e non farmi male\n" +
                                "Consumerai ciò che rimane\n" +
                                "\n" +
                                "E non vuole dire che\n" +
                                "Nulla è più di lei\n" +
                                "E ucciderti non potrei\n" +
                                "Conta su di me\n" +
                                "In preda ormai\n" +
                                "Non sento fatica in me\n" +
                                "Piove e ritrovo gli Dei\n" +
                                "Consolami e non farmi male\n" +
                                "Consumerai ciò che rimane"));
                        arrayCanzoni.add(new Canzone("Dymo","In bilico e non vorrei\n" +
                                "Trovami un medico\n" +
                                "E non rido più e i sogni sono neri\n" +
                                "Ma non investigherò\n" +
                                "E non credo poi che ciò ti serva\n" +
                                "Pura accademy\n" +
                                "Spettrale sei e non voglio mi veda\n" +
                                "Boia avvelenami\n" +
                                "\n" +
                                "In un mai che non serve\n" +
                                "Ora che ti riavvolgerei\n" +
                                "In un mai che non sorge\n" +
                                "E lo sai, non è folle\n" +
                                "Mi ami o non più?\n" +
                                "Tu mi ami o non più?\n" +
                                "Sei un limite\n" +
                                "E salperai per Miranda\n" +
                                "Ma l'amore è qui dove sei\n" +
                                "\n" +
                                "Continuerai\n" +
                                "Per chi non lo sai\n" +
                                "Sciocco onirico\n" +
                                "Oggi sei fanatico\n" +
                                "Predichi un mai\n" +
                                "Predichi un mai\n" +
                                "\n" +
                                "Ma come?\n" +
                                "Che ti dice il cuore?\n" +
                                "Hai ragione, ebbene sì\n" +
                                "Hai ragione, credimi fai bene\n" +
                                "Lo si fa per difendersi\n" +
                                "Hai ragione, ragione\n" +
                                "\n" +
                                "Continuerai\n" +
                                "Finché non vedrai\n" +
                                "Sciocco onirico\n" +
                                "Oggi sei fanatico\n" +
                                "Mediti un mai\n" +
                                "Mediti un mai"));
                        arrayCanzoni.add(new Canzone("Colle immane","Che sciocco io però\n" +
                                "Credo nelle favole\n" +
                                "Insetto mitico\n" +
                                "Perso nel polline\n" +
                                "\n" +
                                "Ma che bisogno c'è?\n" +
                                "Che faccio qui e tu dove sei?\n" +
                                "Lo sai ti ammiro già\n" +
                                "Scultura immobile\n" +
                                "\n" +
                                "Colle immane\n" +
                                "Chissà che mira ho?\n" +
                                "Colle immane\n" +
                                "Chissà a che pensi tu?\n" +
                                "\n" +
                                "E sale da un sì, sei solo tu e non capirai\n" +
                                "E spingi la mia mente in volo\n" +
                                "Forse vedrai\n" +
                                "\n" +
                                "Sciocco io per sempre\n" +
                                "Non sarò mai cosciente\n" +
                                "E sciocca tu comunque\n" +
                                "Ehi! All'ultimo dove sei?\n" +
                                "\n" +
                                "Colle immane\n" +
                                "Chissà che mira ho?\n" +
                                "Colle immane\n" +
                                "Chissà a che pensi tu?\n" +
                                "\n" +
                                "Ne uscirò\n" +
                                "Rivedrai\n" +
                                "Come puoi\n" +
                                "Cambierai\n" +
                                "E ciò che sembra è\n"));
                        arrayCanzoni.add(new Canzone("Un blu sincero","Uomo ormai\n" +
                                "È un segno in più che dai\n" +
                                "Rinchiudi il sole e dormi\n" +
                                "Cosa rimane da dividersi?\n" +
                                "È un blu sincero e tu vuoi\n" +
                                "Non scherzare se nemmeno puoi\n" +
                                "Sei tu di più\n" +
                                "Non posso restare\n" +
                                "Non posso restare\n" +
                                "\n" +
                                "Vedi non dipende da te\n" +
                                "È folle e immane\n" +
                                "Credi non dipende da te\n" +
                                "\n" +
                                "Uomo ormai\n" +
                                "È un segno che in più ti dai\n" +
                                "È il blu che insegna e tu vuoi\n" +
                                "Posa le mani tra i pensieri tuoi\n" +
                                "Vai giù di più\n" +
                                "Di quello che sogni\n" +
                                "Di quello che sogni\n" +
                                "\n" +
                                "Vedi non dipende da te\n" +
                                "È folle e immane\n" +
                                "Credi non dipende da te\n" +
                                "\n" +
                                "Oh, tu sai di nuovo c'è\n" +
                                "Un vento insipido\n" +
                                "È senza lacrime\n" +
                                "E sei un dire illogico\n" +
                                "Per niente fisico\n" +
                                "E allora tu chi sei?\n" +
                                "\n" +
                                "Uomo ormai\n" +
                                "È un segno in più che dai\n" +
                                "Rinchiuso al sole dormi\n" +
                                "Cosa rimane per redimersi\n" +
                                "Sei tu di più\n" +
                                "Di quello che sogni\n" +
                                "Di quello che vuoi\n" +
                                "Di quello che vuoi\n" +
                                "Di quello che\n"));
                        arrayCanzoni.add(new Canzone("Identikit","Che male c'è?\n" +
                                "Vivo dentro di te\n" +
                                "Immobile io sarei\n" +
                                "Giuro immobile\n" +
                                "Io non credo impazzirò\n" +
                                "Dammi nuove idee\n" +
                                "Triste ninfea\n" +
                                "Dammi nuove idee\n" +
                                "Dammi nuove idee\n" +
                                "\n" +
                                "Cado a picco ormai\n" +
                                "Niente è come sai\n" +
                                "Nella frenesia\n" +
                                "Non andare via\n" +
                                "Forse è comico\n" +
                                "Ladro come puoi\n" +
                                "Forse non lo sai\n" +
                                "Ti cerco nell'anima\n" +
                                "Non vedi e in più\n" +
                                "Stacci ancora qui\n" +
                                "Sperpera i tuoi sì\n" +
                                "Spegni così\n" +
                                "La tua ragione\n"));
                        arrayCanzoni.add(new Canzone("Fuoco amico I","Togli un mai\n" +
                                "Dai un sì se puoi\n" +
                                "E sì è ciò che dai\n" +
                                "Ma sembra perfido\n" +
                                "Ora è un sì\n" +
                                "Cos'hai che non ho io?\n" +
                                "Lo sai non riesco più\n" +
                                "Se tu non sei il mio Dio\n" +
                                "Dai balliamo un po', tutti insieme\n" +
                                "\n" +
                                "Dare puoi\n" +
                                "Ancora è su di noi\n" +
                                "Vivo al rovescio ormai\n" +
                                "Appesa stupirai\n" +
                                "Iena sei\n" +
                                "E sbrani i giorni miei\n" +
                                "Ti troverò così\n" +
                                "Al centro dei lividi\n" +
                                "Dai saltiamo un po', tutti insieme\n" +
                                "\n" +
                                "Quasi mi estinguerei\n" +
                                "Lo stigma c'ho\n" +
                                "Succhiare anche i nervi tuoi\n" +
                                "Se peggio io sto\n" +
                                "Grave capire è\n" +
                                "Che faccia ho\n" +
                                "In un ciclone, in un ciclone\n" +
                                "\n" +
                                "Eh già, non vedi che dai il minimo\n" +
                                "E sputi gli anni miei\n" +
                                "Nel paleolitico\n" +
                                "E poi se ci stai alienami\n" +
                                "Nel fumo, dove sei\n" +
                                "Lacrimerò per chilometri\n" +
                                "Per chilometri\n" +
                                "\n" +
                                "Torna in me\n" +
                                "E dire puoi\n" +
                                "Cose che sai\n" +
                                "Spegni il buio in me\n" +
                                "Che sembra che poi\n" +
                                "Ti vedrò\n" +
                                "Dentro al fumo ormai\n" +
                                "Dì cose che sai\n" +
                                "Sì, però\n" +
                                "A chi ti appoggerai?\n" +
                                "Sei quello che vuoi, mio eroe\n"));
                        arrayCanzoni.add(new Canzone("Fuoco amico II (pela i miei tratti)","Grandissimo omaggio, finalmente atteso, vieni qui\n" +
                                "Si traduce nella luce, lo immagini?\n" +
                                "\n" +
                                "Ma forse è il cuore che non regge i chilometri\n" +
                                "Sciocco odiarsi, pela i miei tratti ed amami\n" +
                                "\n" +
                                "Cosa ci vuole dai\n" +
                                "Nessun guerriero può arrendersi\n" +
                                "Ma supera i monti come un colibrì\n" +
                                "Sciocco odiarsi, pela i miei tratti ed amami\n"));
                        arrayCanzoni.add(new Canzone("Nera visione","Trova un pensiero, includilo\n" +
                                "Esso appare in incognito\n" +
                                "Va a gonfie vele\n" +
                                "Dare non sa, non lo fa\n" +
                                "È pioggia il silicone, non vedi?\n" +
                                "Non cade neanche più\n" +
                                "Muove in giù\n" +
                                "\n" +
                                "Oh no, non è più buio il cuore\n" +
                                "Non sai se finge\n" +
                                "Parlagli lì, ondeggia anche tu, oh\n" +
                                "\n" +
                                "Acceso che fai\n" +
                                "Spegni se puoi la nera visione\n" +
                                "Ehi, non tu\n" +
                                "Tu sei già divino\n" +
                                "E già mi hai diviso\n" +
                                "Niente in più\n" +
                                "\n" +
                                "Ogni volta che tremi un po' sale\n" +
                                "E ridi fuori e dentro ormai, uh oh\n" +
                                "Folle idea, insieme cresci il mio errore\n" +
                                "È come non diresti mai, uh, oh\n" +
                                "Prova a restare, prestagli il cuore\n" +
                                "E credi non ha smesso mai"));
                        arrayCanzoni.add(new Canzone("Troppe scuse","Con me hai vinto tu\n" +
                                "Cosa ti riempie di più\n" +
                                "Se ci penso è ipocrisia\n" +
                                "Come se tu non fossi mia\n" +
                                "Poi nell'odio investirai\n" +
                                "Che destino inferno mi dai\n" +
                                "Ooh qualcuno mi vendicherà\n" +
                                "\n" +
                                "Dillo, stacci senza ali se puoi\n" +
                                "Che non puoi più viverci in noi\n" +
                                "Già nel mondo rischi, eh sì\n" +
                                "È come se tu non fossi qui\n" +
                                "Testuggine all'ombra\n" +
                                "Mi sorridi anche se\n" +
                                "\n" +
                                "Non dilagare\n" +
                                "Scendi dagli avvoltoi\n" +
                                "Un destino atroce, sai\n" +
                                "Meglio se amore dai\n" +
                                "Combinare idee e sentirsi dire che\n" +
                                "Dilago ormai\n" +
                                "Dilago ormai\n" +
                                "\n" +
                                "Con me hai vinto tu\n" +
                                "Cosa ti riempie di più\n" +
                                "Se ci penso è ipocrisia\n" +
                                "È come se tu non fossi mia\n" +
                                "Come se\n" +
                                "\n" +
                                "Come se\n" +
                                "Oh, succedere può\n" +
                                "Ormai c'è\n" +
                                "E prega se vuoi\n" +
                                "Ci stai in un filo di seta\n" +
                                "Ti scorderai che qui si muore\n" +
                                "E correrai agli sci\n" +
                                "Ci stai in un filo di vento, dai\n" +
                                "Proverai a volare, oh no"));
                        arrayCanzoni.add(new Canzone("Natale con Ozzy","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Lady Hollywood","Provaci un po'\n" +
                                "Spegni chi sei\n" +
                                "Provaci un po'\n" +
                                "Spegni chi sei\n" +
                                "E' un affare già pluriennale\n" +
                                "Oh no, la strada sale\n" +
                                "E viaggiare è restare qui\n" +
                                "Se rimani qui, forse annegherò\n" +
                                "Le sere qui ad Hollywood\n" +
                                "Sai le pagherò\n" +
                                "Non stai per risorgermi\n" +
                                "Sono vivo ormai\n" +
                                "Eppure respiro, sì, non mi ferirai\n" +
                                "Neve dentro al fuoco ormai sei\n" +
                                "Suda, mia lady\n" +
                                "Tornare da quel vuoto saprei\n" +
                                "Torna chi più crede\n" +
                                "Oh no, è come se\n" +
                                "Mi trascinassi via il cuore\n" +
                                "Sai scappare via ci vuole\n" +
                                "E' sera e fai finta di uscire\n" +
                                "Consumerai pure il sole\n" +
                                "E' su di noi, che caldo fa\n" +
                                "E' pomeriggio ormai"));
                        arrayCanzoni.add(new Canzone("Caleido","Conopa\n" +
                                "Il mio cuore è una giungla\n" +
                                "E dici che\n" +
                                "Tu ne sai\n" +
                                "In un mare che affonda non affogherò\n" +
                                "\n" +
                                "Ovvio sai\n" +
                                "Qui ci vuole una giunta o affogherò\n" +
                                "E tu ne hai\n" +
                                "Fino al cuore è una giungla e non dirmi che\n" +
                                "Uh yeh, uh yeh\n" +
                                "\n" +
                                "Caleido\n" +
                                "Ma hey faccio fuori gli dei\n" +
                                "Mai lo potrei\n" +
                                "Ma hey faccio fuori gli dei\n" +
                                "Mai lo vorrai\n" +
                                "Ma hey faccio fuori gli dei\n" +
                                "E forse non converrai\n" +
                                "Ma hey faccio fuori gli dei\n" +
                                "\n" +
                                "Tu eri qua, non ci stare\n" +
                                "E dire di sì, che ci vuole\n" +
                                "Percorrerò le tue scale\n" +
                                "E migliorerò che ci vuole\n" +
                                "Percorrerò le tue scale\n" +
                                "\n" +
                                "Oooh io dubbi non ho\n" +
                                "Mi sospendevi in giù\n" +
                                "Io mille paranoie\n" +
                                "Ma mi sospendevi in giù\n" +
                                "La mia riparazione\n" +
                                "Ma mi sospendevi in giù\n" +
                                "Curavi le parole\n" +
                                "Ma ye, ye, ye, ye, ye, yeeeeeh\n" +
                                "\n" +
                                "I tuoi ora asciugano i miei\n" +
                                "Ma mi sospendevi in giù\n" +
                                "Io mille paranoie\n" +
                                "Ma mi sospendevi in giù\n" +
                                "Qualificavi il cuore\n" +
                                "Poi mi sospendevi in giù\n" +
                                "Dicevi che ci vuole\n" +
                                "Ma mi sospendevi in giù\n" +
                                "Sapevi come fare\n" +
                                "Ma mi sospendevi in giù\n" +
                                "La mia riparazione\n" +
                                "Ma mi sospendevi in giù\n" +
                                "\n" +
                                "Magnifico\n" +
                                "Per nessuno di noi\n" +
                                "Mai lo po...\n" +
                                "Per nessuno di noi"));
                        arrayCanzoni.add(new Canzone("Waltz del Bounty","Colpa mia, cosa fai?\n" +
                                "Giusto un Bounty e te ne andrai\n" +
                                "E non riuscirò a prenderti al volo\n" +
                                "Sì, vedrai, ti prenderà il suolo\n" +
                                "\n" +
                                "Venirne a capo io devo, devo\n" +
                                "Parlane almeno se è vero\n" +
                                "Che su di noi rivolta è già\n" +
                                "\n" +
                                "Onde strane, per natura\n" +
                                "Eri ieri un'altra cosa\n" +
                                "Fare sì che duri\n" +
                                "E ti riempirà anche il sole\n" +
                                "A me, ti giuro, confondi\n" +
                                "Ed è vero vai in frantumi\n" +
                                "Tu prendi, prendi anche il volo in me\n" +
                                "Dubai diu\n" +
                                "\n" +
                                "Non sai neanche più chi sei\n" +
                                "E nemmeno s'alza più la marea\n" +
                                "Controbilanciami\n" +
                                "E togli gli occhi da me\n" +
                                "Comunque arrivi tu\n" +
                                "Destino di lacrime\n" +
                                "Se trovi un attimo\n" +
                                "Shiva riprendimi\n" +
                                "Prima che arrivi il sole"));
                        break;
                    case 18:
                        arrayCanzoni.add(new Canzone("Ovunque","È buio ormai\n" +
                                "Non mi frega se piangi o no ooh\n" +
                                "Io come te\n" +
                                "Confusione\n" +
                                "Ora lo so\n" +
                                "Non mi sento più bene da un pò\n" +
                                "Quello che fai non mi basta mai\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque\n" +
                                "\n" +
                                "Mi spazzi via\n" +
                                "E mi vedo volare lontano\n" +
                                "Che male fa\n" +
                                "Rivedermi in me\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque\n" +
                                "\n" +
                                "È buio ormai...\n" +
                                "\n" +
                                "Ovunque sei\n" +
                                "Ovunque sei ci sei\n" +
                                "Ovunque sei\n" +
                                "Ovunque"));
                        arrayCanzoni.add(new Canzone("Valvonauta","Mi affogherei\n" +
                                "E anche se non mi viene\n" +
                                "Io senza lei\n" +
                                "E anche se non c'è miele\n" +
                                "Mi viene dolce\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Io senza lei\n" +
                                "Riesco appena a sentire\n" +
                                "Che non ci sei\n" +
                                "E riesco appena a stupirmi\n" +
                                "Va tutto bene\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai, mai\n" +
                                "\n" +
                                "Mi affogherei\n" +
                                "E anche se non conviene\n" +
                                "Io senza lei\n" +
                                "E anche se non c'è miele\n" +
                                "Mi viene dolce\n" +
                                "E penso sempre lo stesso\n" +
                                "Mi affogherei\n" +
                                "\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai\n" +
                                "Sto bene se non torni mai, mai"));
                        arrayCanzoni.add(new Canzone("Pixel","No io non so com'è\n" +
                                "Ma mi sembra inutile\n" +
                                "Dirti di più perché\n" +
                                "Non ci sei\n" +
                                "Non ci sei\n" +
                                "Ora non sei più che mai\n" +
                                "Una visione semplice\n" +
                                "Vorrei di più perché\n" +
                                "Non ci sei\n" +
                                "\n" +
                                "Io tremo con lei\n" +
                                "Forse ci sei\n" +
                                "Io vorrei di più\n" +
                                "Un po' di lei\n" +
                                "Dio contro di me\n" +
                                "È come vorrei\n" +
                                "Sfiorarti di più... aaaah\n" +
                                "\n" +
                                "Non so supersfogo che non c'è\n" +
                                "Lo so cosa qui c'è che non c'è\n" +
                                "Non so supersfogo che non c'è\n" +
                                "Lo so cosa qui c'è che non c'è\n" +
                                "\n" +
                                "Io tremo con lei\n" +
                                "Forse ci sei\n" +
                                "Io vorrei di più\n" +
                                "Un po' di lei\n" +
                                "Dio contro di me\n" +
                                "È come vorrei\n" +
                                "Sfiorarti di più..."));
                        arrayCanzoni.add(new Canzone("L’infinita Gioia Di Henry Bahus","Io non ti avrò mai\n" +
                                "Ma sento che c'è\n" +
                                "Mi sfiori\n" +
                                "Mi sento lontano come non mai\n" +
                                "Nei miei neri e blu non mi sembra di trovarti mai\n" +
                                "Ora sento che io dovrei lei vomitare\n" +
                                "\n" +
                                "Qualcosa non va\n" +
                                "Qualcosa in me\n" +
                                "E sudi\n" +
                                "Mi vedo all'inverso come non mai\n" +
                                "Nei miei neri e blu non mi sembra di trovarti mai\n" +
                                "Ora bevo in lei e mi sento più speciale\n" +
                                "\n" +
                                "E dentro me\n" +
                                "E dentro me\n" +
                                "Io come lei\n" +
                                "E dentro me\n" +
                                "E dentro me\n" +
                                "Io come lei\n" +
                                "\n" +
                                "Qualcosa non va qualcosa in me\n" +
                                "E sudi\n" +
                                "\n" +
                                "Io non ti avrò mai\n" +
                                "Ma sento che c'è\n" +
                                "Mi sfiori\n" +
                                "Mi sento lontano come non mai\n" +
                                "Nei miei neri e blu non mi sembra di trovarti mai\n" +
                                "Ora sento che io dovrei lei vomitare\n" +
                                "\n" +
                                "E dentro me\n" +
                                "E dentro me\n" +
                                "Io come lei\n" +
                                "E dentro me\n" +
                                "E dentro me\n" +
                                "Io come lei"));
                        arrayCanzoni.add(new Canzone("Vera","Vera dormi un pò\n" +
                                "Ma non sei così\n" +
                                "Dolce come sei\n" +
                                "Vera tu mi fai\n" +
                                "Ma non è così\n" +
                                "Piano dormi e vai\n" +
                                "\n" +
                                "E più in là\n" +
                                "Più in là\n" +
                                "Io lo so\n" +
                                "Tu mi fai\n" +
                                "\n" +
                                "Vera scivola\n" +
                                "E sento che sei\n" +
                                "Dove non sei mai\n" +
                                "Ora dormi in me\n" +
                                "E so che non dovrei\n" +
                                "Dirti dove sei\n" +
                                "\n" +
                                "E più in là\n" +
                                "Più in là\n" +
                                "Io lo so\n" +
                                "Tu mi fai\n"));
                        arrayCanzoni.add(new Canzone("Dentro Sharon","Tremi un pò\n" +
                                "E non è facile\n" +
                                "Urlare nei rumori tuoi\n" +
                                "Per te\n" +
                                "Dentro Sharon\n" +
                                "Nell'immagine\n" +
                                "Perdo spesso un po' di me\n" +
                                "In te\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione\n" +
                                "\n" +
                                "Già da un pò\n" +
                                "Sono agli ordini\n" +
                                "I tuoi occhi su di me\n" +
                                "Oh no\n" +
                                "Dentro Sharon\n" +
                                "Nell'immagine\n" +
                                "Fuori il mondo grida e qui\n" +
                                "Io e te\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione\n" +
                                "\n" +
                                "Shaaa... Sharon\n" +
                                "Shaaa... Sharon...\n" +
                                "Shaaa... Sharon\n" +
                                "Shaaa... Sharon\n" +
                                "\n" +
                                "Ebbene posso insistere\n" +
                                "Confusione...\n" +
                                "Confusione..."));
                        arrayCanzoni.add(new Canzone("Caramel Pop","Caramel pop\n" +
                                "Caramel pop\n" +
                                "Caramel pop\n" +
                                "Quella cosa che senti\n" +
                                "Quando sei vuoto\n" +
                                "Tutto quello che vorresti\n" +
                                "E che non hai\n" +
                                "Tutto quello che sei\n" +
                                "O che non sei mai stato\n" +
                                "Tutto\n"));
                        arrayCanzoni.add(new Canzone("Viba","Sono sveglio o forse no\n" +
                                "Ma non m'importa\n" +
                                "Tu sei l'unica per me\n" +
                                "Sarò lento quanto vuoi\n" +
                                "Tu non ti senti più\n" +
                                "Così fragile\n" +
                                "\n" +
                                "Io con te\n" +
                                "Solo che ci sei\n" +
                                "Quando non mi vuoi\n" +
                                "Io sto bene\n" +
                                "Com'è buio, lo sai\n" +
                                "Non ti sbagli mai\n" +
                                "\n" +
                                "Non mi spiego quasi mai\n" +
                                "Ma non ho fretta\n" +
                                "Voglio bene a un po' di me\n" +
                                "Forse sbaglio o forse no\n" +
                                "Tu non ti senti più\n" +
                                "Così fragile\n" +
                                "\n" +
                                "Io con te\n" +
                                "Solo che ci sei\n" +
                                "Quando non mi vuoi\n" +
                                "Io sto bene\n" +
                                "Com'è buio, lo sai\n" +
                                "Non ti sbagli mai\n" +
                                "\n" +
                                "Così vicina a me\n" +
                                "Ma così fuori da me\n" +
                                "In fondo tu mi vuoi\n" +
                                "E se mi vuoi\n" +
                                "Io volo eeeeeeh\n" +
                                "Io volo eeeeeeh"));
                        arrayCanzoni.add(new Canzone("Ultranoia","No\n" +
                                "Non ci sei\n" +
                                "È strano sai\n" +
                                "Sentirti come me\n" +
                                "Qui\n" +
                                "Sfregami\n" +
                                "È qui che stai\n" +
                                "Soffiando su di me\n" +
                                "\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Lei\n" +
                                "Piano corre da me\n" +
                                "Tu\n" +
                                "Tu mi spegni\n" +
                                "Se\n" +
                                "Sei tu\n" +
                                "\n" +
                                "Che mi vuoi\n" +
                                "Fuori di me\n" +
                                "È giusto sai\n" +
                                "Sentirti su di me\n" +
                                "Tu\n" +
                                "Seno blu\n" +
                                "Mi vuoi per te\n" +
                                "Mi sento così giù\n" +
                                "\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Lei\n" +
                                "Piano corre da me\n" +
                                "Tu\n" +
                                "Tu mi spegni\n" +
                                "Se\n" +
                                "Sei tu\n" +
                                "\n" +
                                "Che mi vuoi\n" +
                                "Fuori di me\n" +
                                "È giusto sai\n" +
                                "Sentirti come me\n" +
                                "Qui\n" +
                                "Sfregami\n" +
                                "È qui che stai\n" +
                                "Soffiando su di me\n" +
                                "\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Lei\n" +
                                "Piano corre da me\n" +
                                "Tu\n" +
                                "Tu mi spegni\n" +
                                "Se\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Lei\n" +
                                "Piano corre da me\n" +
                                "Tu\n" +
                                "Tu mi spegni\n" +
                                "Se\n" +
                                "In vena scorre\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu\n" +
                                "Sei tu"));
                        arrayCanzoni.add(new Canzone("Zoe","Io non dormo mai\n" +
                                "Dormo in me\n" +
                                "Scuse solide\n" +
                                "La mia immagine\n" +
                                "Non sono io\n" +
                                "Sento ridere\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Io non dormo mai\n" +
                                "E so\n" +
                                "Scuse ruvide\n" +
                                "La mia vanità\n" +
                                "Non sono io\n" +
                                "Sento ridere\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "Uuaaaaaaaaaaaaaah Zoe\n" +
                                "\n" +
                                "Vorrei credere\n" +
                                "Che non ci sei\n" +
                                "Nelle lacrime\n" +
                                "Forse tu ci sei\n" +
                                "Ma non ci sei\n" +
                                "Vorrei spegnermi\n" +
                                "\n" +
                                "Su di te\n" +
                                "Te\n" +
                                "Te\n" +
                                "Te\n"));
                        arrayCanzoni.add(new Canzone("Bambina in nero","Lei si consuma su di me\n" +
                                "Lei si nasconde ma non so dov'è\n" +
                                "Con le tue ali in coma stai\n" +
                                "Lei non ha tempo Io non so perché\n" +
                                "Perché\n" +
                                "\n" +
                                "E tu sei sola\n" +
                                "E tu sei sola\n" +
                                "\n" +
                                "Lei si consuma su di me\n" +
                                "Lei si consuma lenta dentro me\n" +
                                "Con le tue mani in coma stai\n" +
                                "Lei non ha tempo io non so perché\n" +
                                "Perché\n" +
                                "\n" +
                                "E tu sei sola\n" +
                                "E tu sei sola\n" +
                                "Tu sei sola\n" +
                                "E tu sei sola"));
                        arrayCanzoni.add(new Canzone("eyeliner","Vedi blu\n" +
                                "E ti senti fragile\n" +
                                "Ora, sgomma\n" +
                                "Vieni giù\n" +
                                "E non c'è da ridere\n" +
                                "\n" +
                                "Lei mi incolla\n" +
                                "Incolla\n" +
                                "\n" +
                                "Non sono mai\n" +
                                "Come mi vorrei\n" +
                                "Ora sgomma\n" +
                                "Così fai\n" +
                                "Quel che puoi per me\n" +
                                "\n" +
                                "Lei mi incolla\n" +
                                "Incolla\n" +
                                "Incolla\n" +
                                "\n" +
                                "Vedi blu\n" +
                                "E ti senti fragile\n" +
                                "Ora, sgomma\n" +
                                "Vieni giù\n" +
                                "E non c'è da ridere\n" +
                                "\n" +
                                "Lei mi incolla\n" +
                                "Incolla\n" +
                                "Incolla, uh\n" +
                                "Incolla\n" +
                                "Incolla, uh\n" +
                                "Incolla, incolla\n" +
                                "Incolla, incolla\n" +
                                "Incolla, yeah"));
                        arrayCanzoni.add(new Canzone("Bonne Nouvelle","Ora che... ora... ti senti ok\n" +
                                "Un grido in più\n" +
                                "E poi tu... non ci sei più\n" +
                                "Se vuoi mi annego\n" +
                                "Ti senti ok\n" +
                                "Un giro intorno\n" +
                                "Non ci sei più... più!\n" +
                                "Aaaahh\n" +
                                "Aaaahh\n" +
                                "\n" +
                                "Un'ora in più... un'ora... mi sento ok\n" +
                                "Affondo giù\n" +
                                "Ebbene, non ci sei più\n" +
                                "E mi comprime\n" +
                                "E sento che\n" +
                                "Va così bene\n" +
                                "Mi sento ok\n" +
                                "\n" +
                                "Non c'è più limite\n" +
                                "Mi sento scemo e non vorrei\n" +
                                "Doverci rider su\n" +
                                "Mi sento strano e non vorrei\n" +
                                "\n" +
                                "Ora che... ora... ti senti ok\n" +
                                "Un grido in più\n" +
                                "E poi tu... non ci sei più\n" +
                                "Se vuoi mi annego\n" +
                                "Ti senti ok\n" +
                                "Un giro intorno\n" +
                                "Non ci sei più... più!\n" +
                                "\n" +
                                "Non c'è più limite\n" +
                                "\n" +
                                "Mi sento scemo e non vorrei\n" +
                                "\n" +
                                "Doverci rider su...\n" +
                                "\n" +
                                "Mi sento strano e non vorrei\n" +
                                "\n" +
                                "Ok... ok... ok... ok\n"));
                        arrayCanzoni.add(new Canzone("Ormogenia","Affogami dentro te\n" +
                                "Io non ho mai un po’ di me\n" +
                                "Bruciami, stai con me\n" +
                                "Con me (x5)\n" +
                                "Affogami dentro te\n" +
                                "Io non ho mai un po’ di me\n" +
                                "Con te (x33)\n"));
                        arrayCanzoni.add(new Canzone("Corpi","Collo\n" +
                                "Così amabile\n" +
                                "Solo\n" +
                                "Dentro gli occhi miei\n" +
                                "\n" +
                                "Forse\n" +
                                "Così anemico\n" +
                                "Forse\n" +
                                "Io non so se è vero\n" +
                                "\n" +
                                "Lei è triste\n" +
                                "Triste\n" +
                                "\n" +
                                "Sfoggio\n" +
                                "Sulle regole\n" +
                                "Solo\n" +
                                "Nudo e inutile\n" +
                                "\n" +
                                "Lei è triste\n" +
                                "Triste\n" +
                                "\n" +
                                "Triste\n" +
                                "Triste\n" +
                                "Triste\n" +
                                "Triste\n"));
                        arrayCanzoni.add(new Canzone("Da Giordi","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Fiato Adolescenziale","Eh, scimmie, non mi frega vivere\n" +
                                "Succhiandomi, io non devo esigere\n" +
                                "Carne, bamboline stitiche\n" +
                                "Cullandomi, io non devo esigere\n" +
                                "Guardami come sei\n" +
                                "Io non so più perdere\n" +
                                "Guardami come puoi\n" +
                                "Io amavo le mie\n" +
                                "Scimmie, grandi mani su di me\n" +
                                "Mangimi, crollo e penso solo a me\n" +
                                "Guardami come sei\n" +
                                "Io non so più perdere\n" +
                                "Guardami come puoi\n" +
                                "Io non so più perdere\n" +
                                "Eh\n" +
                                "Dovrei, fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Uh, uhuh, la la\n" +
                                "Eh, ihih, la la\n" +
                                "Uh, uhuh, lala, mi\n" +
                                "Scimmie, non mi frega vivere\n" +
                                "Succhiandomi, io non devo esigere\n" +
                                "Carne, bamboline stitiche\n" +
                                "Cullandomi, io non devo ridere\n" +
                                "Guardami come sei\n" +
                                "Io non so più perdere\n" +
                                "Guardami come puoi\n" +
                                "Io non so più perdere\n" +
                                "Eh\n" +
                                "Ehi, fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Fuori me\n" +
                                "Uh, uhuh, la la\n" +
                                "Eh, ihih, la la\n" +
                                "Uh, uhuh, lala, mi"));
                        arrayCanzoni.add(new Canzone("Oggi","No, non sono io\n" +
                                "È un ricordo di attimi e guai\n" +
                                "Mi viene facile\n" +
                                "Lo vedrai, lo vedrai\n" +
                                "\n" +
                                "Io che non ho mai\n" +
                                "Qualcosa che tu non avrai mai\n" +
                                "Devo dividermi\n" +
                                "Sentirai, sentirai\n" +
                                "\n" +
                                "Oggi io non sono\n" +
                                "Oggi io non\n" +
                                "Oggi io non so\n" +
                                "Sono\n" +
                                "Sono\n"));
                        arrayCanzoni.add(new Canzone("Fuxia (Acoustic Version)","Eroina fertile\n" +
                                "Vincerai tu\n" +
                                "Suicida isterico\n" +
                                "Dove sei?\n" +
                                "Curami\n" +
                                "Curami\n" +
                                "Adesso no\n" +
                                "\n" +
                                "Io che non so\n" +
                                "Più dove andrò\n" +
                                "Pure se vuoi\n" +
                                "Ma io non lo so\n" +
                                "Dove sei\n" +
                                "\n" +
                                "Voglio e posso perdere\n" +
                                "Vincerai tu\n" +
                                "Sangue in seno voli via\n" +
                                "Lavami lì\n" +
                                "Curami\n" +
                                "Curami\n" +
                                "Ancora un pò\n" +
                                "\n" +
                                "Io che non so\n" +
                                "Più dove andrò\n" +
                                "Pure se puoi\n" +
                                "Ma io non lo so\n" +
                                "Non lo so\n" +
                                "Non lo so\n" +
                                "\n" +
                                "Dove sei (x17)"));
                        arrayCanzoni.add(new Canzone("Ormogenia (Demo)","Affogami dentro te\n" +
                                "Io non ho mai un po’ di me\n" +
                                "Bruciami, stai con me\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "(Ehi, ehi, ehi)\n" +
                                "\n" +
                                "Ammirami solo un pò\n" +
                                "Solo no, non mi avrai\n" +
                                "Affogami dentro te\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "(Ehi, ehi, ehi)\n" +
                                "\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "Con me\n" +
                                "Woah\n" +
                                "\n" +
                                "Affogami dentro te"));
                        arrayCanzoni.add(new Canzone("Piuma","Non c'è più un'immagine\n" +
                                "Ma sento che la vorrei con me\n" +
                                "Lo sai che c'è\n" +
                                "Io penso che ci riuscirei\n" +
                                "Qualcuno dentro i sensi miei\n" +
                                "Qualcosa che si posa in fondo dentro me\n" +
                                "Dentro non c'è\n" +
                                "Io sento lei\n" +
                                "Poi affondo nel vuoto\n" +
                                "Che io giuro che c'è\n" +
                                "Penso come sei e a come tutto urla in te\n" +
                                "Il sommergibile\n" +
                                "Io giuro lo vorrei\n" +
                                "Il vuoto dentro i sensi miei\n" +
                                "E sento che\n" +
                                "Sei tutto quello che vorrei\n" +
                                "Che vorrei\n" +
                                "Mi sento invincibile\n" +
                                "E sento che ti vorrei con me\n" +
                                "Lo sai che puoi\n" +
                                "Io penso che ci riuscirei\n" +
                                "Qualcuno dentro i sensi miei\n" +
                                "Qualcosa che si posa infondo dentro me\n" +
                                "Dentro me\n" +
                                "Dentro me\n" +
                                "Dentro me\n" +
                                "Dentro me\n" +
                                "Dentro me"));
                        arrayCanzoni.add(new Canzone("Shika (Live)","Anche se lei non c'è\n" +
                                "Io mi sento ok\n" +
                                "Perché dove è lei è così difficile\n" +
                                "\n" +
                                "Anche se lei non c'è\n" +
                                "Io mi sento ok\n" +
                                "Perché dove è lei è così difficile\n" +
                                "\n" +
                                "Anche se lei non c'è\n" +
                                "Io mi sento ok\n" +
                                "Perché dove è lei è così difficile\n" +
                                "È così difficile\n" +
                                "È così difficile\n"));
                        break;
                    case 19:
                        arrayCanzoni.add(new Canzone("BRAZIL (Abisso)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Brazil (Bramante)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Scintillatore (Carnitas)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Brazil (Nottambula)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Lullaby (Vs. 2)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Brazil (Dubbi)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Scintillatore (Trista Processione)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Scintillatore (Bambola A Gas)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Stagno Brado","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Scintillatore (Papani)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Brazil (Cenicero)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Scintillatore (D2)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Brazil (Charogne)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Brazil (Exepto)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Scintillatore (Rogorifero)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Brazil (Zz)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Brazil (Chitarrorista)","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Lullaby","[Strumentale]"));
                        arrayCanzoni.add(new Canzone("Scintillatore (Kurt Cobain)","[Strumentale]"));
                        break;
                }
                Intent intent = new Intent(mContext,CanzoniActivity.class);
                intent.putExtra("arrayCanzoni",arrayCanzoni);
                mContext.startActivity(intent);
            });
        }
    }
}