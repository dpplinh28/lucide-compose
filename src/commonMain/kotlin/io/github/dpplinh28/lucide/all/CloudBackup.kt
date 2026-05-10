package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudBackup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 15.251f)
                arcTo(4.5f, 4.5f, 0f, false, false, 17.5f, 8f)
                horizontalLineToRelative(-1.79f)
                arcTo(7f, 7f, 0f, true, false, 3f, 13.607f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                arcToRelative(5f, 5f, 0f, false, false, 9f, -3f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -4.5f, -4.5f)
                arcToRelative(4.82f, 4.82f, 0f, false, false, -3.41f, 1.41f)
                lineTo(7f, 15f)
            }
}

public val LucideIcons.All.CloudBackupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudBackup: ImageVector
    @Composable get() = CloudBackupDefinition.asImageVector()
