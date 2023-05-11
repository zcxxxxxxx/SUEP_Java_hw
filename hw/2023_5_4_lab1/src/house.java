
// 编写房屋类及家具类，要求：
// 1）房子有户型，总面积和家具名称列表，新房子没有任何的家具。
// 2）家具有名字和占地面积，家具可以增加不同种类和型号，其中初始值：
// 床：占4平米,衣柜：占2平米,餐桌：占1.5平米
// 3）打印房子时，要求输出:户型，总面积，剩余面积，家具名称列表。
import java.util.ArrayList;

class Furniture {
    private String name;
    private double area;

    public Furniture(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return name;
    }
}

class House {
    private String type;
    private double area;
    private ArrayList<Furniture> furnitureList;

    public House(String type, double area) {
        this.type = type;
        this.area = area;
        this.furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public double getArea() {
        double furnitureArea = 0;
        for (Furniture furniture : furnitureList) {
            furnitureArea += furniture.getArea();
        }
        return area - furnitureArea;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("户型：" + type + "\n");
        sb.append("总面积：" + area + "平米\n");
        sb.append("剩余面积：" + getArea() + "平米\n");
        sb.append("家具名称列表：");
        for (Furniture furniture : furnitureList) {
            sb.append(furniture.toString() + " ");
        }
        return sb.toString();
    }
}
