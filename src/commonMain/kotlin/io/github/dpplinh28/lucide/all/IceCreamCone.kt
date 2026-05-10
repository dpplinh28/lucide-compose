package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IceCreamCone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 11f)
                lineToRelative(4.08f, 10.35f)
                arcToRelative(1f, 1f, 0f, false, false, 1.84f, 0f)
                lineTo(17f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 7f)
                arcTo(5f, 5f, 0f, false, false, 7f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 7f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -4f)
            }
}

public val LucideIcons.All.IceCreamConeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IceCreamCone: ImageVector
    @Composable get() = IceCreamConeDefinition.asImageVector()
