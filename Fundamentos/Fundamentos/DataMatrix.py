from pylibdmtx.pylibdmtx import decode
import cv2
import numpy as np


def dataMat(image, bgr):
    gray_img = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    data = decode(gray_img)
    print(data)
    for decodedObject in data:
        points = decodedObject.rect

        pts = np.array(points, np.int32)
        pts = pts.reshape((-1, 1, 2))
        cv2.polylines(image, [pts], True, (0, 255, 0), 3)

        cv2.putText(frame, decodedObject.data.decode("utf-8") , (30, 30), cv2.FONT_HERSHEY_SIMPLEX, 1,
                    bgr, 2)

        print("Barcode: {} ".format(decodedObject.data.decode("utf-8")))

bgr = (8, 70, 208)

frame  = cv2.imread('datamat.png')
code = dataMat(frame, bgr)
print(code)
cv2.imshow('Data Matrix reader', frame)
code = cv2.waitKey(0)