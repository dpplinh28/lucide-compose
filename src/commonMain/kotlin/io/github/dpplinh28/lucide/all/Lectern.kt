package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lectern") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, 1.902f, -1.38f)
                lineToRelative(1.056f, -3.333f)
                arcTo(1f, 1f, 0f, false, false, 21f, 6f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -.958f, 1.287f)
                lineToRelative(1.056f, 3.334f)
                arcTo(2f, 2f, 0f, false, false, 5f, 12f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.LecternDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lectern: ImageVector
    @Composable get() = LecternDefinition.asImageVector()
