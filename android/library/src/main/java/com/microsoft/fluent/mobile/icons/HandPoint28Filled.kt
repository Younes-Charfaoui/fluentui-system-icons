package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HandPoint28: ImageVector
  get() {
    if (_handPoint28 != null) {
      return _handPoint28!!
    }
    _handPoint28 = fluentIcon(name = "Filled.HandPoint28", 28f) {
      materialPath {
          moveTo(13.0F, 2.0F)
          curveToRelative(-1.656F, 0.0F, -3.0F, 1.343F, -3.0F, 3.0F)
          verticalLineToRelative(8.085F)
          lineToRelative(-1.14F, -0.518F)
          curveToRelative(-2.313F, -1.051F, -5.045F, -0.376F, -6.603F, 1.631F)
          curveToRelative(-0.504F, 0.65F, -0.228F, 1.571F, 0.49F, 1.881F)
          curveToRelative(7.212F, 3.116F, 9.074F, 5.921F, 9.82F, 7.942F)
          curveToRelative(0.455F, 1.23F, 1.67F, 2.155F, 3.092F, 1.952F)
          lineToRelative(5.498F, -0.784F)
          curveToRelative(1.104F, -0.158F, 2.004F, -0.967F, 2.277F, -2.049F)
          lineToRelative(1.387F, -5.483F)
          curveToRelative(0.853F, -3.371F, -1.46F, -6.723F, -4.914F, -7.122F)
          lineTo(16.0F, 10.085F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          close()        
      }
    }
    return _handPoint28!!
  }

private var _handPoint28: ImageVector? = null
