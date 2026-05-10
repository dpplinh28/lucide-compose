package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HardHat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 6f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 15f)
                verticalLineToRelative(-3f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 15.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.HardHatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HardHat: ImageVector
    @Composable get() = HardHatDefinition.asImageVector()
