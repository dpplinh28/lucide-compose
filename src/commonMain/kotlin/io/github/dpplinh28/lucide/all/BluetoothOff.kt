package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17f, 17f)
                lineToRelative(-5f, 5f)
                verticalLineTo(12f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f, 9.5f)
                lineTo(17f, 7f)
                lineToRelative(-5f, -5f)
                verticalLineToRelative(4.5f)
            }
}

public val LucideIcons.All.BluetoothOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothOff: ImageVector
    @Composable get() = BluetoothOffDefinition.asImageVector()
