"""import xml.etree.ElementTree as xml
from xml.etree.ElementTree import tostring


root = xml.Element("root")
c1 = xml.Element("child")
root.append(c1)
type1 =xml.SubElement(c1,"grandchild")
type1.text ="yes"

tree=xml.ElementTree(root)
data= tostring(root)
with open('result.txt','w') as f:
    f.write('tree')
print(data)
print(tree)"""
from xml.dom import minidom
import os 
  
  
root = minidom.Document()
  
xml = root.createElement('root') 
root.appendChild(xml)
  
productChild = root.createElement('product')
productChild.setAttribute('name', 'Geeks for Geeks')
  
xml.appendChild(productChild)
  
xml_str = root.toprettyxml(indent ="\t") 
  
save_path_file = "gfg.xml"
  
with open(save_path_file, "w") as f:
    f.write(xml_str) 