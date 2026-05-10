package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scale3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 7f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.293f, 18.707f)
                lineTo(11f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.Scale3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scale3d: ImageVector
    @Composable get() = Scale3dDefinition.asImageVector()
