package com.zouye.houm;
/*二维数组模拟大厦
* */
public class hote {
/*
二维数组，模拟大厦所有房间
* */
    private room[][] rooms;
//     盖楼通过构造方法来盖楼
    public hote(){
//        一共有几层，房间类型，编号
//        可以先写死，一共三层，一层单人间，二层标准间，三层总统套房
//        编号101,102,201,202，301,302，每层有10间
//       动态初始化
        rooms = new room[3][10];//3行10列，3层楼，每层楼10个房间
        
//        创建30个room对象放在数组中，得new
//        二维数组遍历，放进去
        for (int i = 0; i < rooms.length; i++) {//i是下标，i+1是楼层，i
            for (int j = 0; j < rooms[i].length; j++) {
                if (i== 0) {
                    rooms[i][j] = new room((i+1)*100+j+1,"单人间",true);
                }else if (i== 1){
                    rooms[i][j] = new room((i+1)*100+j+1,"标准间",true);
                }else if (i == 2){
                    rooms[i][j] = new room((i+1)*100+j+1,"总统套房",true);
                }
            }
            
        }
        

    }
//在酒店对象上提供一共打印列表的方法
    public void print(){
//        打印所有房间状态，就是遍历二维数组
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                room a = rooms[i][j];
//               不用加tostring
                System.out.print(a);
            }
//            换行
            System.out.println();
        }
    }

/*
定房间，调用此方法需要传递一共房间编号过来，这个房间编号是前台小姐姐输入的

*/

    public void order(int roonno){
//        订房主要是把房间对象的status改为false
//        假设房间编号是207（下标room【1】【6】
//        通过房间编号验算出下标
        room a=rooms[roonno/100-1][roonno%100-1];
//        占用
        a.setStatus(false);
        System.out.println(roonno+"已订房");
    }
//退房,
    public void exit(int roomno){
        room a=rooms[roomno/100-1][roomno%100-1];
        a.setStatus(true);
        System.out.println(roomno+"已退房");
    }

}
