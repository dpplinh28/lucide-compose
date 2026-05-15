package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothConnected") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 7f)
                lineToRelative(10f, 10f)
                lineToRelative(-5f, 5f)
                verticalLineTo(2f)
                lineToRelative(5f, 5f)
                lineTo(7f, 17f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                lineTo(21f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                lineTo(6f, 12f)
            }
}

public val LucideIcons.All.BluetoothConnectedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothConnected: ImageVector
    @Composable get() = BluetoothConnectedDefinition.asImageVector()
