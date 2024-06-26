package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.DataLine24: ImageVector
  get() {
    if (_dataLine24 != null) {
      return _dataLine24!!
    }
    _dataLine24 = fluentIcon(name = "Filled.DataLine24", 24f) {
      materialPath {
          moveTo(16.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          reflectiveCurveToRelative(3.0F, 1.343F, 3.0F, 3.0F)
          reflectiveCurveToRelative(-1.343F, 3.0F, -3.0F, 3.0F)
          curveToRelative(-0.162F, 0.0F, -0.321F, -0.013F, -0.476F, -0.037F)
          lineToRelative(-2.038F, 3.357F)
          curveTo(16.811F, 12.8F, 17.0F, 13.378F, 17.0F, 14.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          curveToRelative(-0.903F, 0.0F, -1.713F, -0.399F, -2.262F, -1.03F)
          lineToRelative(-3.742F, 1.87F)
          curveTo(7.999F, 17.894F, 8.0F, 17.948F, 8.0F, 18.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          reflectiveCurveToRelative(-3.0F, -1.343F, -3.0F, -3.0F)
          reflectiveCurveToRelative(1.343F, -3.0F, 3.0F, -3.0F)
          curveToRelative(1.066F, 0.0F, 2.003F, 0.556F, 2.535F, 1.394F)
          lineToRelative(3.531F, -1.765F)
          curveTo(11.023F, 14.426F, 11.0F, 14.216F, 11.0F, 14.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          curveToRelative(0.482F, 0.0F, 0.938F, 0.114F, 1.341F, 0.316F)
          lineToRelative(1.798F, -2.963F)
          curveTo(16.445F, 7.803F, 16.0F, 6.953F, 16.0F, 6.0F)
          close()        
      }
    }
    return _dataLine24!!
  }

private var _dataLine24: ImageVector? = null
