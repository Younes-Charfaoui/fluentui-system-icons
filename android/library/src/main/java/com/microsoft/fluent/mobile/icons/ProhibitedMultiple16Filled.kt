package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ProhibitedMultiple16: ImageVector
  get() {
    if (_prohibitedMultiple16 != null) {
      return _prohibitedMultiple16!!
    }
    _prohibitedMultiple16 = fluentIcon(name = "Filled.ProhibitedMultiple16", 16f) {
      materialPath {
          moveTo(3.818F, 3.818F)
          curveToRelative(1.577F, -1.577F, 4.032F, -1.739F, 5.79F, -0.486F)
          lineTo(3.332F, 9.608F)
          curveToRelative(-1.253F, -1.758F, -1.09F, -4.213F, 0.486F, -5.79F)
          close()
          moveToRelative(0.574F, 6.85F)
          lineToRelative(6.276F, -6.276F)
          curveToRelative(1.253F, 1.758F, 1.09F, 4.213F, -0.486F, 5.79F)
          curveToRelative(-1.577F, 1.577F, -4.032F, 1.739F, -5.79F, 0.486F)
          close()
          moveToRelative(6.85F, -7.91F)
          curveTo(8.9F, 0.413F, 5.1F, 0.413F, 2.758F, 2.757F)
          curveToRelative(-2.343F, 2.343F, -2.343F, 6.141F, 0.0F, 8.485F)
          curveToRelative(2.344F, 2.343F, 6.142F, 2.343F, 8.486F, 0.0F)
          curveToRelative(2.343F, -2.344F, 2.343F, -6.143F, 0.0F, -8.486F)
          close()
          moveTo(14.0F, 7.0F)
          curveToRelative(0.0F, 3.866F, -3.134F, 7.0F, -7.0F, 7.0F)
          curveToRelative(-0.477F, 0.0F, -0.944F, -0.048F, -1.394F, -0.139F)
          curveToRelative(0.914F, 0.564F, 1.991F, 0.889F, 3.144F, 0.889F)
          curveToRelative(3.314F, 0.0F, 6.0F, -2.686F, 6.0F, -6.0F)
          curveToRelative(0.0F, -1.153F, -0.325F, -2.23F, -0.889F, -3.144F)
          curveTo(13.952F, 6.056F, 14.0F, 6.523F, 14.0F, 7.0F)
          close()        
      }
    }
    return _prohibitedMultiple16!!
  }

private var _prohibitedMultiple16: ImageVector? = null
