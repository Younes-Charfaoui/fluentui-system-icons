package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Broom32: ImageVector
  get() {
    if (_broom32 != null) {
      return _broom32!!
    }
    _broom32 = fluentIcon(name = "Filled.Broom32", 32f) {
      materialPath {
          moveTo(28.293F, 2.293F)
          curveToRelative(0.39F, -0.39F, 1.024F, -0.39F, 1.414F, 0.0F)
          curveToRelative(0.39F, 0.39F, 0.39F, 1.023F, 0.0F, 1.414F)
          lineToRelative(-9.34F, 9.34F)
          curveToRelative(2.21F, 2.894F, 1.99F, 7.01F, -0.66F, 9.66F)
          lineTo(18.914F, 23.5F)
          lineTo(8.524F, 13.11F)
          lineToRelative(0.781F, -0.73F)
          curveToRelative(2.633F, -2.62F, 6.742F, -2.952F, 9.647F, -0.746F)
          lineToRelative(9.34F, -9.341F)
          close()
          moveTo(6.773F, 14.187F)
          lineTo(2.586F, 16.09F)
          curveToRelative(-0.298F, 0.135F, -0.511F, 0.409F, -0.57F, 0.731F)
          curveToRelative(-0.058F, 0.323F, 0.045F, 0.654F, 0.277F, 0.886F)
          lineToRelative(12.0F, 12.0F)
          curveToRelative(0.232F, 0.232F, 0.563F, 0.335F, 0.886F, 0.277F)
          curveToRelative(0.322F, -0.059F, 0.596F, -0.272F, 0.731F, -0.57F)
          lineToRelative(1.903F, -4.187F)
          lineToRelative(-11.04F, -11.04F)
          close()        
      }
    }
    return _broom32!!
  }

private var _broom32: ImageVector? = null
