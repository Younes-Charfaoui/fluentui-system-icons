package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LaptopMultiple24: ImageVector
  get() {
    if (_laptopMultiple24 != null) {
      return _laptopMultiple24!!
    }
    _laptopMultiple24 = fluentIcon(name = "Filled.LaptopMultiple24", 24f) {
      materialPath {
          moveTo(6.627F, 5.0F)
          horizontalLineToRelative(10.622F)
          curveToRelative(1.519F, 0.0F, 2.75F, 1.231F, 2.75F, 2.75F)
          verticalLineToRelative(6.622F)
          curveToRelative(0.874F, -0.31F, 1.5F, -1.143F, 1.5F, -2.122F)
          verticalLineToRelative(-4.5F)
          curveToRelative(0.0F, -2.347F, -1.903F, -4.25F, -4.25F, -4.25F)
          horizontalLineToRelative(-8.5F)
          curveToRelative(-0.98F, 0.0F, -1.813F, 0.626F, -2.122F, 1.5F)
          close()
          moveTo(6.25F, 6.0F)
          curveTo(5.007F, 6.0F, 4.0F, 7.007F, 4.0F, 8.25F)
          verticalLineToRelative(6.5F)
          curveTo(4.0F, 15.993F, 5.007F, 17.0F, 6.25F, 17.0F)
          horizontalLineToRelative(10.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineToRelative(-6.5F)
          curveTo(19.0F, 7.007F, 17.993F, 6.0F, 16.75F, 6.0F)
          horizontalLineTo(6.25F)
          close()
          moveToRelative(-3.5F, 12.5F)
          curveTo(2.336F, 18.5F, 2.0F, 18.836F, 2.0F, 19.25F)
          reflectiveCurveTo(2.336F, 20.0F, 2.75F, 20.0F)
          horizontalLineToRelative(17.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(2.75F)
          close()        
      }
    }
    return _laptopMultiple24!!
  }

private var _laptopMultiple24: ImageVector? = null
