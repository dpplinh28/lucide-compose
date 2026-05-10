package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.3f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                lineToRelative(-3.1f, -3.1f)
                arcToRelative(2f, 2f, 0f, false, false, -2.814f, .014f)
                lineTo(6f, 21f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 19.5f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 22f)
                verticalLineToRelative(-5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ImageUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageUp: ImageVector
    @Composable get() = ImageUpDefinition.asImageVector()
