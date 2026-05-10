package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseBackup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcToRelative(9f, 3f, 0f, false, false, 5f, 2.69f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9.3f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(9f, 3f, 0f, false, false, 6.47f, 2.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 20f)
                arcToRelative(5f, 5f, 0f, false, false, 9f, -3f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -4.5f, -4.5f)
                curveToRelative(-1.33f, 0f, -2.54f, .54f, -3.41f, 1.41f)
                lineTo(12f, 16f)
            }
}

public val LucideIcons.All.DatabaseBackupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseBackup: ImageVector
    @Composable get() = DatabaseBackupDefinition.asImageVector()
