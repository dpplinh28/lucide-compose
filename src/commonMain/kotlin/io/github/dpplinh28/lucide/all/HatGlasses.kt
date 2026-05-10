package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HatGlasses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 18f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 11f)
                lineToRelative(-2.11f, -6.657f)
                arcToRelative(2f, 2f, 0f, false, false, -2.752f, -1.148f)
                lineToRelative(-1.276f, .61f)
                arcTo(2f, 2f, 0f, false, true, 12f, 4f)
                horizontalLineTo(8.5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.925f, 1.456f)
                lineTo(5f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 11f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.HatGlassesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HatGlasses: ImageVector
    @Composable get() = HatGlassesDefinition.asImageVector()
