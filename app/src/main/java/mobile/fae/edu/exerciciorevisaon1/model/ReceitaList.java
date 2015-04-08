package mobile.fae.edu.exerciciorevisaon1.model;

import android.support.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Eric on 08/04/2015.
 */
@JsonRootName("receitas")
public class ReceitaList implements Iterable<Receita>, List<Receita>{

    private List<Receita> receitas;

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    @Override
    public void add(int location, Receita object) {
        receitas.add(location, object);
    }

    @Override
    public boolean add(Receita object) {
        return false;
    }

    @Override
    public boolean addAll(int location, Collection<? extends Receita> collection) {
        return receitas.addAll(location, collection);
    }

    @Override
    public boolean addAll(Collection<? extends Receita> collection) {
        return receitas.addAll(collection);
    }

    @Override
    public void clear() {
        receitas.clear();
    }

    @Override
    public boolean contains(Object object) {
        return receitas.contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return receitas.containsAll(collection);
    }

    @Override
    public Receita get(int location) {
        return receitas.get(location);
    }

    @Override
    public int indexOf(Object object) {
        return receitas.indexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return receitas.isEmpty();
    }

    @Override
    public Iterator<Receita> iterator() {
        return receitas.iterator();
    }

    @Override
    public int lastIndexOf(Object object) {
        return receitas.lastIndexOf(object);
    }

    @NonNull
    @Override
    public ListIterator<Receita> listIterator() {
        return receitas.listIterator();
    }

    @NonNull
    @Override
    public ListIterator<Receita> listIterator(int location) {
        return receitas.listIterator(location);
    }

    @Override
    public Receita remove(int location) {
        return receitas.remove(location);
    }

    @Override
    public boolean remove(Object object) {
        return receitas.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return receitas.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return receitas.retainAll(collection);
    }

    @Override
    public Receita set(int location, Receita object) {
        return receitas.set(location, object);
    }

    @Override
    public int size() {
        return receitas.size();
    }

    @NonNull
    @Override
    public List<Receita> subList(int start, int end) {
        return receitas.subList(start, end);
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return receitas.toArray();
    }

    @NonNull
    @Override
    public <T> T[] toArray(T[] array) {
        return receitas.toArray(array);
    }
}
