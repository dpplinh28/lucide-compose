package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GraduationCap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.42f, 10.922f)
                arcToRelative(1f, 1f, 0f, false, false, -.019f, -1.838f)
                lineTo(12.83f, 5.18f)
                arcToRelative(2f, 2f, 0f, false, false, -1.66f, 0f)
                lineTo(2.6f, 9.08f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.832f)
                lineToRelative(8.57f, 3.908f)
                arcToRelative(2f, 2f, 0f, false, false, 1.66f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12.5f)
                verticalLineTo(16f)
                arcToRelative(6f, 3f, 0f, false, false, 12f, 0f)
                verticalLineToRelative(-3.5f)
            }
}

public val LucideIcons.All.GraduationCapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GraduationCap: ImageVector
    @Composable get() = GraduationCapDefinition.asImageVector()
